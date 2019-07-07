package org.excel;

import java.lang.annotation.*;

/**
 * @author huqingfeng 1397649957@qq.com
 * @date 2019/1/4 2:51 PM
 * @since 1.0.0
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Property {

    /**
     *  字段释义 长字段名
     */
    String value();

    /**
     *  短字段名
     */
    String titleShort() default "";

    /**
     *  子段详情
     * @return
     */
    String desc() default "";

    /**
     *  是否是直接从数据库取出来的
     */
    boolean direct() default false;

}
