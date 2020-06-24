package com.sim.sapjco.annotations;

import java.lang.annotation.*;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 11:13
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JcoField {
    /**
     * fieldname
     *
     * @return
     */
    String fieldname();

    /**
     * 字表名
     *
     * @return
     */
    String table() default "";
}
