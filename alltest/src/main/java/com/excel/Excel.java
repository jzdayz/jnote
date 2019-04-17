package com.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.google.common.io.Closer;
import com.pes.jd.mapper.PesReportCategoryMapper;
import com.pes.jd.mapper.PesReportPropertyMapper;
import com.pes.jd.model.DO.PesReportCategory;
import com.pes.jd.model.DO.PesReportProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class Excel {

    interface Interceptor<T>{
        void filter(T t);
    }

    static class InterceptorChain<T>{
        private List<Interceptor<T>> interceptors = new ArrayList<>();

        void add(Interceptor<T> interceptor){
            interceptors.add(interceptor);
        }

        void filter(T t){
            if (interceptors==null){
                return;
            }
            for (Interceptor<T> interceptor : interceptors) {
                interceptor.filter(t);
            }
        }

    }

    private InterceptorChain<PesReportProperty> chain = new InterceptorChain<>();

    {
        /*客服 拦截*/
        chain.add((x)->{
            if (x.getType()!=2){
                return;
            }
            if (x.getTitle().startsWith("销售额")&&x.getTitlelong().startsWith("销售额")){
                x.setTitlelong("销售额");
                x.setFilterFlag((byte) 1);
                x.setFilterJson("[{\"id\":1,\"title\":\"扣除退款\",\"property\":\"refund_amount\",\"isFilter\":false},{\"id\":2,\"title\":\"扣除邮费\",\"property\":\"post_fee\",\"isFilter\":false}]");
                return;
            }
            if (x.getTitlelong().startsWith("销售量")&&x.getTitle().startsWith("销售量")){
                x.setTitlelong("销售量");
                x.setFilterFlag((byte) 1);
                x.setFilterJson("[{\"id\":3,\"isFilter\":false,\"title\":\"扣除退款件数\",\"property\":\"refund_product_num\"}]");
                return;
            }
        });
        /*店铺 拦截*/
        chain.add((x)->{
            if (x.getType()!=1){
                return;
            }
            if (x.getTitlelong().startsWith("店铺销售额")){
                x.setTitlelong("店铺销售额");
                x.setFilterJson("[{\"id\":5,\"title\":\"扣除退款\",\"property\":\"refund_amount\",\"isFilter\":false},{\"id\":6,\"title\":\"扣除邮费\",\"property\":\"post_fee\",\"isFilter\":false}]");
                x.setFilterFlag((byte) 1);
                return;
            }
            if (x.getTitlelong().startsWith("店铺销售量")){
                x.setTitlelong("店铺销售量");
                x.setFilterJson("[{\"id\":4,\"isFilter\":false,\"title\":\"扣除退款件数\",\"property\":\"refund_product_num\"}]");
                x.setFilterFlag((byte) 1);
                return;
            }
            if (x.getTitlelong().startsWith("客服销售额")){
                x.setTitlelong("客服销售额");
                x.setFilterJson("[{\"id\":8,\"title\":\"扣除退款\",\"property\":\"refund_amount\",\"isFilter\":false},{\"id\":9,\"title\":\"扣除邮费\",\"property\":\"post_fee\",\"isFilter\":false}]");
                x.setFilterFlag((byte) 1);
                return;
            }
            if (x.getTitlelong().startsWith("客服销售量")){
                x.setTitlelong("客服销售量");
                x.setFilterJson("[{\"id\":7,\"isFilter\":false,\"title\":\"扣除退款件数\",\"property\":\"refund_product_num\"}]");
                x.setFilterFlag((byte) 1);
                return;
            }
            if (x.getTitlelong().startsWith("静默销售额")){
                x.setTitlelong("静默销售额");
                x.setFilterJson("[{\"id\":2,\"title\":\"扣除退款\",\"property\":\"refund_amount\",\"isFilter\":false},{\"id\":3,\"title\":\"扣除邮费\",\"property\":\"post_fee\",\"isFilter\":false}]");
                x.setFilterFlag((byte) 1);
                return;
            }
            if (x.getTitlelong().startsWith("静默销售量")){
                x.setTitlelong("静默销售量");
                x.setFilterJson("[{\"id\":1,\"isFilter\":false,\"title\":\"扣除退款件数\",\"property\":\"refund_product_num\"}]");
                x.setFilterFlag((byte) 1);
                return;
            }
        });
    }


    private PesReportCategoryMapper categoryMapper;
    private PesReportPropertyMapper propertyMapper;

    public Excel(PesReportCategoryMapper categoryMapper, PesReportPropertyMapper propertyMapper) {
        this.categoryMapper = categoryMapper;
        this.propertyMapper = propertyMapper;
    }

    public void doImport(Type type) {
        String location = "/Users/huqingfeng/Downloads/店铺、客服字段-2019-04-17.xlsx";
        List<List<String>> res = new ArrayList<>();
        try (
                Closer closer = Closer.create()
        ){
            final FileInputStream in = closer.register(new FileInputStream(location));
            EasyExcelFactory.readBySax(in, new Sheet(2, 0),
                    new AnalysisEventListener(){

                        private String type;

                        @Override
                        public void invoke(Object object, AnalysisContext context) {
                            List<String> row = (List<String>) object;
                            if (type == null||row.get(0)!=null){
                                type = row.get(0);
                            }
                            row.set(0,type);
                            res.add(row);
                        }

                        @Override
                        public void doAfterAllAnalysed(AnalysisContext context) {

                        }
                    });
        }catch (Exception e){e.printStackTrace();}
        final Map<String, List<List<String>>> longValMap
                = res.stream().collect(Collectors.groupingBy(k -> k.get(1)));
        // check
        if (res.size()!=longValMap.size()){
            for (List<List<String>> value : longValMap.values()) {
                if(value.size()>1){
                    System.out.println(("重复的长字段名"));
                    for (List<String> strLst : value) {
                        for (String str : strLst) {
                            System.out.print(str);
                        }
                        System.out.println();
                    }
                }
            }
            return;
        }
        // TODO 删除所有的数据
        // 类别
        final String[] catLst = res.stream().map(k -> k.get(0)).collect(Collectors.toSet()).toArray(new String[0]);
        // 类别对应的ID
        Map<String,Long> catId = new HashMap<>();
        for (String cat : catLst) {
            PesReportCategory category = new PesReportCategory();
            category.setName(cat);
            category.setStatus((byte) 1);
            category.setTitle(cat);
            categoryMapper.insert(category);
            catId.put(category.getName(), (category.getId()));
        }

        // 导入property
        final Field[] declaredFields = CsPerformanceVo.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            final Property annotation = declaredField.getAnnotation(Property.class);
            if (annotation==null)return;
            // 长字段名
            final String value = annotation.value();
            final List<String> row = longValMap.get(value).get(0)/*一直都是一个元素*/;
            PesReportProperty property = new PesReportProperty();
            final String cat = row.get(0);
            property.setCategoryId(catId.get(cat));
            property.setTitlelong(value);
            property.setTitle(row.get(2));
            property.setDesc(row.get(3));
            property.setSource(row.get(4));
            if (type == Type.CS){
                property.setType((byte) 2);
            }else if (type == Type.SHOP){
                property.setType((byte) 1);
            }else {
                Assert.isTrue(false,"错误类型");
            }
            property.setProperty(declaredField.getName());
            /*特殊处理*/
            chain.filter(property);
            propertyMapper.insert(property);
        }
    }
    enum Type{SHOP,CS}


    @PostConstruct
    public void init(){
        System.out.println("是否导入数据？(y/n)");
        Scanner in = new Scanner(System.in);
        final String next = in.next();
        if (
                Objects.equals(next,"Y")||
                        Objects.equals(next,"y")||
                        Objects.equals(next,"YES")||
                        Objects.equals(next,"yes")
        )
        doImport(Type.CS);
    }
}
