package org.excel

import com.alibaba.excel.EasyExcelFactory
import com.alibaba.excel.ExcelWriter
import com.alibaba.excel.metadata.Sheet
import com.google.common.io.Closer

import java.util.function.Function
import java.util.stream.Collectors


class ExcelRead {
    static void main(String[] args) {
        read1()
    }

    static void read0(){
        Closer closer = Closer.create()
        def sql = "select b.shop_id 店铺Id,b.seller_nick 主账号名称,b.title 店铺名,count(1) 客服数\n" +
                "from pes_cs a left join pes_shop b on a.shop_id = b.shop_id\n" +
                "where b.seller_nick in (%s) group by a.shop_id\n" +
                ""
        try {
            InputStream inputStream = closer.register(new BufferedInputStream(new FileInputStream(
                    "/Users/huqingfeng/Downloads/客服数统计.xlsx"
            )))
            def allData = new ArrayList()
            def data = EasyExcelFactory.read(inputStream, new Sheet(1, 0))
            def go
            for( row in data ){
                List<String> lst = row
                if (go){
                    allData.add(row)
                }
                if (Objects.equals(lst.get(0),"店铺名")){
                    go = true
                }
            }
            go = false
            println(allData.size)
            inputStream = closer.register(new BufferedInputStream(new FileInputStream(
                    "/Users/huqingfeng/Downloads/客服数统计.xlsx"
            )))
            data = EasyExcelFactory.read(inputStream, new Sheet(2, 0))
            def a = 0;
            for( row in data ){
                List<String> lst = row
                if (go){
                    allData.add(row)
                    a++;
                }
                if (Objects.equals(lst.get(0),"店铺名")){
                    go = true
                }
            }
            println(a + "cishu ")
            String str = ""


            def  k = 0
            for ( ro in allData){
                def get0 = ro.invokeMethod("get",0)
                str += "'"+get0+"',"

                k++
            }
            sql = String.format(sql,(str).substring(0,str.length()-1))
            println(allData.size)
            println(sql)
            println(k)



            //所有的

        } catch (Exception e){
            e.printStackTrace()
        } finally {
            closer.close()
        }
    }

    static void read(String path,Closer closer,List<List<String>> res,String condition){
        def inputStream = closer.register(new BufferedInputStream(new FileInputStream(
                path
        )))
        def data = EasyExcelFactory.read(inputStream, new Sheet(2, 0))
        def a = 0;
        def go = false
        for( row in data ){
            List<String> lst = row
            if (go){
                res.add(row)
                a++
            }
            if (Objects.equals(lst.get(0).trim(),condition)){
                go = true
            }
        }
    }

    static void  write(List<String> res,FileOutputStream out){
        ExcelWriter writer = EasyExcelFactory.getWriter(out)

//写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
        Sheet sheet1 = new Sheet(1, 3);
        sheet1.setSheetName("第一个sheet")
//设置列宽 设置每列的宽度
//        Map columnWidth = new HashMap();
//        columnWidth.put(0,10000);columnWidth.put(1,40000);columnWidth.put(2,10000);columnWidth.put(3,10000);
//        sheet1.setColumnWidthMap(columnWidth);
//        sheet1.setHead(createTestListStringHead());
//or 设置自适应宽度
sheet1.setAutoWidth(Boolean.TRUE);
        writer.write1(res, sheet1);

//写第二个sheet sheet2  模型上打有表头的注解，合并单元格
//        Sheet sheet2 = new Sheet(2, 3, JavaModel1.class, "第二个sheet", null);
//        sheet2.setTableStyle(createTableStyle());
//        writer.write(createTestListJavaMode(), sheet2);
//
////写第三个sheet包含多个table情况
//        Sheet sheet3 = new Sheet(3, 0);
//        sheet3.setSheetName("第三个sheet");
//        Table table1 = new Table(1);
//        table1.setHead(createTestListStringHead());
//        writer.write1(createTestListObject(), sheet3, table1);
//
////写sheet2  模型上打有表头的注解
//        Table table2 = new Table(2);
//        table2.setTableStyle(createTableStyle());
//        table2.setClazz(JavaModel1.class);
//        writer.write(createTestListJavaMode(), sheet3, table2);
//
//关闭资源
        writer.finish();
        out.close();
    }

    static void read1(){
        Closer closer = Closer.create()
        def
//                sql = "select sum(consult_num) 咨询人数 ,shop_id from pes_jd_sub_01.pes_cs_performance_2019 where date between '2019-06-01' and\n" +
//                "    '2019-06-27' and shop_id in (%s) group by shop_id limit 1000"

        sql =
                "select sum(consult_session_num) as 咨询量 , shop_id\n" +
                "from pes_jd_sub_01.pes_cs_chat_session_service_index_2019 where date between '2019-06-01' and\n" +
                "'2019-06-27' and shop_id in (%s) group by shop_id limit 1000"
        try {
            InputStream inputStream = closer.register(new BufferedInputStream(new FileInputStream(
                    "/Users/huqingfeng/Documents/shop.xlsx"
            )))
            def allData = new ArrayList()
            def data = EasyExcelFactory.read(inputStream, new Sheet(1, 0))
            def go
            for( row in data ){
                List<String> lst = row
                if (go){
                    allData.add(row)
                }
                if (Objects.equals(lst.get(0),"店铺Id ")){
                    go = true
                }
            }
            // 所有的店铺id  和 店铺name 的映射
            def shopIdMap = allData.stream().collect(Collectors.toMap({ k -> k.invokeMethod("get", 0) }, Function.identity()))

            def set = (shopIdMap as Map).keySet()
            def str = ""
            for( s in set ){
                str+=""+s+","
            }
            sql = String.format(sql,str.substring(0,str.length()-1))
//            println(sql)

            // 读取所有的数据 咨询量
            List<List<String>>  conAll = new ArrayList<>(1000)
            read("/Users/huqingfeng/Documents/db1咨询.xlsx",closer,conAll,"咨询量")
            read("/Users/huqingfeng/Documents/db2咨询.xlsx",closer,conAll,"咨询量")
            read("/Users/huqingfeng/Documents/db3咨询.xlsx",closer,conAll,"咨询量")
            read("/Users/huqingfeng/Documents/db4咨询.xlsx",closer,conAll,"咨询量")

            Map<String,List<String>> a = conAll.stream().collect(Collectors.toMap({k-> (k as List).get(1)},Function.identity()))

            // 咨询人数
            List<List<String>>  zixun = new ArrayList<>(1000)
            read("/Users/huqingfeng/Documents/咨询人数db1.xlsx",closer,zixun,"咨询人数")
            read("/Users/huqingfeng/Documents/咨询人数db2.xlsx",closer,zixun,"咨询人数")
            read("/Users/huqingfeng/Documents/咨询人数db3.xlsx",closer,zixun,"咨询人数")
            read("/Users/huqingfeng/Documents/咨询人数db4.xlsx",closer,zixun,"咨询人数")

            Map<String,List<String>> b = zixun.stream().collect(Collectors.toMap({k-> (k as List).get(1)},Function.identity()))

            List<List<String>> rr = new ArrayList<>(1000)
            def ss = (shopIdMap as Map).entrySet()
            rr.add(Arrays.asList("shopId","主账号名","店铺名","客服数","咨询量","咨询人数","日人均咨询量","日人均咨询人数"))

            for ( i in ss){
                List<String> aa = new ArrayList<>()
                aa.add(i.getKey() as String)
                // 主账号
                aa.add(i.getValue().invokeMethod("get",1) as String)
                // 店铺名
                aa.add(i.getValue().invokeMethod("get",2) as String)
                // 客服数
                def personS = i.getValue().invokeMethod("get",3)
                aa.add(personS as String)


                // 咨询量
                def x = a.get(i.getKey()) != null ? a.get(i.getKey()).invokeMethod("get",0) : 0
                aa.add(x as String)
                // 咨询人数
                def y = b.get(i.getKey()) != null ? b.get(i.getKey()).invokeMethod("get",0) : 0
                aa.add(y as String)
                // 人均咨询量
                aa.add(Integer.valueOf(x as String)/Integer.valueOf(personS as String)/27.0 as String)

                //  人均咨询人数
                aa.add(Integer.valueOf(y as String)/Integer.valueOf(personS as String)/27.0 as String)
                rr.add(aa)
            }

            write(rr as List<String>,closer.register(new FileOutputStream("/Users/huqingfeng/Documents/咨询量咨询人数.xlsx")))
            println("done")

        } catch (Exception e){
            e.printStackTrace()
        } finally {
            closer.close()
        }
    }

}
