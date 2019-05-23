//package com.example.jnote;
//
//import com.baomidou.mybatisplus.core.injector.AbstractMethod;
//import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
//import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
//import com.baomidou.mybatisplus.core.metadata.TableInfo;
//import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
//import com.baomidou.mybatisplus.core.toolkit.GlobalConfigUtils;
//import com.baomidou.mybatisplus.core.toolkit.TableInfoHelper;
//import org.apache.ibatis.builder.MapperBuilderAssistant;
//import org.apache.ibatis.logging.Log;
//import org.apache.ibatis.logging.LogFactory;
//import org.springframework.context.annotation.Configuration;
//
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
//    @Override
//    public void inspectInject(MapperBuilderAssistant builderAssistant, Class<?> mapperClass) {
//        Class<?> modelClass = extractModelClass(mapperClass);
//        if (modelClass != null) {
//            String className = mapperClass.toString();
//            Set<String> mapperRegistryCache = GlobalConfigUtils.getMapperRegistryCache(builderAssistant.getConfiguration());
//            if (!mapperRegistryCache.contains(className)) {
//                List<AbstractMethod> methodList = this.getMethodList();
//                if (CollectionUtils.isNotEmpty(methodList)) {
////                    TableInfo tableInfo = TableInfoHelpear.initTableInfo(builderAssistant, modelClass);
//                    final boolean custom = Arrays.asList(mapperClass.getInterfaces()).contains(customMapperClass);
//                    String tableName=null;
//                    if (custom){
//                        tableName = tableInfo.getTableName();
//                        tableInfo.setTableName("${tableName}");
//                    }
//                    // 循环注入自定义方法
//                    methodList.forEach(m -> m.inject(builderAssistant, mapperClass, modelClass, tableInfo));
//                    if (custom){
//                        tableInfo.setTableName(tableName);
//                    }
//                } else {
//                    logger.debug(mapperClass.toString() + ", No effective injection method was found.");
//                }
//                mapperRegistryCache.add(className);
//            }
//        }
//    }
//}
