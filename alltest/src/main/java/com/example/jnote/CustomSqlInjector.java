//package com.example.jnote;
//
//import com.baomidou.mybatisplus.core.injector.AbstractMethod;
//import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
//import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
//import com.baomidou.mybatisplus.core.metadata.TableInfo;
//import com.baomidou.mybatisplus.core.parser.SqlParserHelper;
//import com.baomidou.mybatisplus.core.toolkit.*;
//import com.pes.jd.mapper.BaseMapper;
//import org.apache.ibatis.builder.MapperBuilderAssistant;
//import org.apache.ibatis.logging.Log;
//import org.apache.ibatis.logging.LogFactory;
//import org.springframework.context.annotation.Configuration;
//
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.lang.reflect.TypeVariable;
//import java.lang.reflect.WildcardType;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Set;
//
//@Configuration
//public class CustomSqlInjector extends DefaultSqlInjector {
//    private static final Log logger = LogFactory.getLog(AbstractSqlInjector.class);
//
//
//    private static final Class<?> customMapperClass = BaseMapper.class;
//
//    public static final String TABLE_NAME_PLACE_HOLDER = "${tableName}";
//
//    @Override
//    public void inspectInject(MapperBuilderAssistant builderAssistant, Class<?> mapperClass) {
//        String className = mapperClass.toString();
//        Set<String> mapperRegistryCache = GlobalConfigUtils.getMapperRegistryCache(builderAssistant.getConfiguration());
//        if (!mapperRegistryCache.contains(className)) {
//            List<AbstractMethod> methodList = this.getMethodList();
//            Assert.notEmpty(methodList, "No effective injection method was found.");
//            final boolean custom = Arrays.asList(mapperClass.getInterfaces()).contains(customMapperClass);
//            String tableName=null;
//            final Class<?> modelClass = extractModelClass(mapperClass);
//            if (modelClass==null)return;
//            TableInfo tableInfo = TableInfoHelper.initTableInfo(builderAssistant, modelClass);
//            if (custom){
//                tableName = tableInfo.getTableName();
//                tableInfo.setTableName(TABLE_NAME_PLACE_HOLDER);
//            }
//            // 循环注入自定义方法
//            methodList.forEach(m -> m.inject(builderAssistant, mapperClass));
//            if (custom){
//                tableInfo.setTableName(tableName);
//            }
//            mapperRegistryCache.add(className);
//            /**
//             * 初始化 SQL 解析
//             */
//            if (GlobalConfigUtils.getGlobalConfig(builderAssistant.getConfiguration()).isSqlParserCache()) {
//                SqlParserHelper.initSqlParserInfoCache(mapperClass);
//            }
//        }
//    }
//
//    private Class<?> extractModelClass(Class<?> mapperClass) {
//        Type[] types = mapperClass.getGenericInterfaces();
//        ParameterizedType target = null;
//        for (Type type : types) {
//            if (type instanceof ParameterizedType) {
//                Type[] typeArray = ((ParameterizedType) type).getActualTypeArguments();
//                if (ArrayUtils.isNotEmpty(typeArray)) {
//                    for (Type t : typeArray) {
//                        if (t instanceof TypeVariable || t instanceof WildcardType) {
//                            break;
//                        } else {
//                            target = (ParameterizedType) type;
//                            break;
//                        }
//                    }
//                }
//                break;
//            }
//        }
//        return target == null ? null : (Class<?>) target.getActualTypeArguments()[0];
//    }
//
//}
