//package com.data.mbp;
//
//import com.baomidou.mybatisplus.core.parser.ISqlParser;
//import com.baomidou.mybatisplus.core.parser.SqlInfo;
//import TableNameParser;
//import com.pes.jd.mapper.BaseMapper;
//import org.apache.ibatis.executor.parameter.ParameterHandler;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.reflection.MetaObject;
//import org.apache.ibatis.reflection.SystemMetaObject;
//import org.mybatis.spring.mapper.MapperFactoryBean;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.CollectionUtils;
//
//import java.lang.reflect.Method;
//import java.util.*;
//import java.util.stream.Collectors;
//
///**
// *  此类的实现主要是增强mbp的BaseMapper
// *  注意项：支持mbp的 {@link BaseMapper}里面的所有方法
// *
// * @author ☞ 🏀 huqingfeng
// * @date 2019-05-23
// */
//
//@Configuration
//public class DynamicTableParser implements ISqlParser , ApplicationContextAware {
//
//    /*标记那些interface是继承自定义baseMapper*/
//    private Set<String> STATEMENT_INTERFACE_BASE = new HashSet<>();
//
//    private Set<String> ALLOW_METHOD = new HashSet<>();
//
//    {
//        ALLOW_METHOD.addAll(
//                Arrays.stream(BaseMapper.class.getDeclaredMethods())
//                        .map(Method::getName).collect(Collectors.toList())
//        );
//    }
//
//    @Override
//    public SqlInfo parser(MetaObject metaObject, String sql) {
//        ParameterHandler parameterHandler = (ParameterHandler)metaObject.getValue("delegate.parameterHandler");
//        final MetaObject paraMetaObject = SystemMetaObject.forObject(parameterHandler);
//        final Object param = paraMetaObject.getValue("parameterObject");
//        MappedStatement mappedStatement = (MappedStatement)paraMetaObject.getValue("mappedStatement");
//        final String id = mappedStatement.getId();
//        // 去除不是继承自定义BaseMapper的mapper
//        int methodDot = id.lastIndexOf(".");
//        if (!STATEMENT_INTERFACE_BASE.contains(id.substring(0, methodDot))){
//            return null;
//        }
//        // 只有指定的方法需要替换
//        if (!ALLOW_METHOD.contains(id.substring(methodDot+1))){
//            return null;
//        }
//        if (!(param instanceof Map)) {
//            return null;
//        }
//        Map args = (Map) param;
//        final Collection<String> tables = new TableNameParser(sql).tables();
//        if (!CollectionUtils.isEmpty(tables)) {
//            boolean update = false;
//            String originSql = sql;
//            final Object tableName = args.get(BaseMapper.TABLE_NAME);
//            if (tables.size() > 1) {
//                // 只支持单表
//                return null;
//            }
//            for (String table : tables) {
//                final String tableNam = String.valueOf(tableName);
//                if (tableNam == null) {
//                    return null;
//                }
//                // 特征实现是最好的
//                originSql = sql.replaceAll(table, tableNam);
//                update = true;
//            }
//            if (update)
//                return SqlInfo.newInstance().setSql(originSql);
//        }
//        return null;
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        final Map<String, MapperFactoryBean> mappers = applicationContext.getBeansOfType(MapperFactoryBean.class);
//        final Collection<MapperFactoryBean> mapperBean = mappers.values();
//        for (MapperFactoryBean mapperFactoryBean : mapperBean) {
//            final Class mapperInterface = mapperFactoryBean.getMapperInterface();
//            if (Arrays.asList(mapperInterface.getInterfaces()).contains(BaseMapper.class)){
//                STATEMENT_INTERFACE_BASE.add(mapperInterface.getName());
//            }
//        }
//    }
//}
