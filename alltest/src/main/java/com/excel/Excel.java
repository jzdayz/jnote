package com.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.google.common.io.Closer;
import com.pes.jd.mapper.PesReportCategoryMapper;
import com.pes.jd.mapper.PesReportPropertyMapper;
import com.pes.jd.model.DO.PesReportCategory;
import com.pes.jd.model.DO.PesReportCategoryExample;
import com.pes.jd.model.DO.PesReportProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

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

    public String trim(String str){

        Set<Character> exclude = new HashSet(
                Arrays.asList((char)160)
        );

        final char[] value = str.toCharArray();
        int len = value.length;
        int st = 0;
        char[] val = value;

        while ((st < len) && (val[st] <= ' '
                || exclude.contains(val[st]))) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' '
                || exclude.contains(val[len - 1]))) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? str.substring(st, len) : str;
    }

    public void doImport(Type type) {
        Integer sheetNo = 2;
        Class doClass = CsPerformanceVo.class;
        if (Objects.equals(type,Type.SHOP)){
            sheetNo = 1;
            doClass = ShopPerformanceBO.class;
        }
        String location = "/Users/huqingfeng/Downloads/店铺、客服字段-2019-04-18.xlsx";
        List<List<String>> res = new ArrayList<>();
        try (
                Closer closer = Closer.create()
        ){
            final FileInputStream in = closer.register(new FileInputStream(location));
            EasyExcelFactory.readBySax(in, new Sheet(sheetNo, 0),
                    new AnalysisEventListener(){

                        private String type;

                        private boolean first = true;

                        @Override
                        public void invoke(Object object, AnalysisContext context) {
                            // 第一行跳过
                            if (first){
                                first=!first;
                                return;
                            }
                            List<String> row = (List<String>) object;
                            for (int i = 0; i < row.size(); i++) {
                                final String clo = row.get(i);
                                if (clo!=null)
                                row.set(i, trim(clo));
                            }
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
        }catch (Exception e){throw new RuntimeException(e);}
        // 根据长字段名 分组
        final Map<String, List<List<String>>> excelLongValMap
                = res.stream().collect(Collectors.groupingBy(k -> k.get(1)));
        // check
        if (res.size()!=excelLongValMap.size()){
            for (List<List<String>> value : excelLongValMap.values()) {
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
        // 类别
        final String[] catLst = res.stream().map(k -> k.get(0)).collect(Collectors.toSet()).toArray(new String[0]);
        // 类别对应的ID
        Map<String,Long> catId = new HashMap<>();
        for (String cat : catLst) {
            PesReportCategory category = new PesReportCategory();
            category.setName(cat);
            category.setStatus((byte) 1);
            category.setTitle(cat);
            final PesReportCategoryExample pesReportCategoryExample = new PesReportCategoryExample();
            pesReportCategoryExample.createCriteria().andNameEqualTo(cat).andTitleEqualTo(cat);
            final List<PesReportCategory> pesReportCategories = categoryMapper.selectByExample(pesReportCategoryExample);
            if (CollectionUtils.isEmpty(pesReportCategories)) {
                categoryMapper.insert(category);
            }else {
                final PesReportCategory categ = pesReportCategories.get(0);
                if (pesReportCategories.size()>1){
                    throw new RuntimeException( String.format("重复的类别：%s", category.getName()));
                }
                category = categ;
            }
            catId.put(category.getName(), (category.getId()));
        }

        // 长字段名的map
        final Map<String, Field> longNameMap = Arrays.stream(doClass.getDeclaredFields())
                .filter(k -> k.getDeclaredAnnotation(Property.class) != null)
                .collect(Collectors.toMap(k -> {
                    final Property annotation = k.getDeclaredAnnotation(Property.class);
                    // 长字段名
                    final String value = annotation.value();
                    return trim(value);
                }, v -> v,(x,y)->{
                    throw new IllegalStateException(String.format(
                            "Duplicate key1: %s key2: %s",x.getName(),y.getName()
                    ));
                }));
        // 导入property
        excelLongValMap.forEach((key,value)->{
            // 同样长字段名
            final Field field = longNameMap.get(key);
            if(field == null){
                throw new RuntimeException(
                        String.format("excel 找不到对应的字段  长字段名：%s",key)
                );
            }
            // excel 对应的一行
            final List<String> excelRow = value.get(0);
            PesReportProperty property = new PesReportProperty();
            property.setCategoryId(catId.get(excelRow.get(0)));
            property.setTitlelong(excelRow.get(1));
            property.setTitle(excelRow.get(2));
            property.setDesc(excelRow.get(3));
            property.setSource(excelRow.get(4));
            if (type == Type.CS){
                property.setType((byte) 2);
            }else if (type == Type.SHOP){
                property.setType((byte) 1);
            }else {
                Assert.isTrue(false,"错误类型");
            }
            property.setProperty(field.getName());
            property.setFilterFlag((byte) 0);
            property.setStatus((byte) 1);
            /*特殊处理*/
            chain.filter(property);
            propertyMapper.insert(property);
        });

    }
    enum Type{SHOP,CS}


    @PostConstruct
    public void init(){
        System.out.println("是否导入数据？(y/n)");
        doImport(Type.CS);
        doImport(Type.SHOP);
        System.out.println("导入数据完成");
    }
}
