package com;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ReflectionUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author ☞🏀
 * @date 2019-05-16
 */
public class JavaToJson {
    public static String convert(Class<?> cla) throws Exception{
        final Object o = cla.newInstance();
        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(cla);
        for (PropertyDescriptor targetPd : targetPds) {
            Method writeMethod = targetPd.getWriteMethod();
            ReflectionUtils.makeAccessible(writeMethod);
            writeMethod.invoke(o,generateVal(targetPd.getPropertyType()));
        }
        return JSON.toJSONString(o);
    }

    private static Object generateVal(Class<?> propertyType) {
        if (Objects.equals(propertyType,String.class)){
            return "testStr";
        }
        if (Objects.equals(propertyType,Long.class)||Objects.equals(propertyType,Long.TYPE)){
            return 0L;
        }
        if (Objects.equals(propertyType,Double.class)||Objects.equals(propertyType,Double.TYPE)){
            return 0D;
        }
        if (Objects.equals(propertyType,Integer.class)||Objects.equals(propertyType,Integer.TYPE)){
            return 0;
        }
        throw new RuntimeException("not support");
    }
}
