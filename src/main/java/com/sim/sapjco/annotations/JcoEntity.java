package com.sim.sapjco.annotations;

import com.sap.conn.jco.JCoDestination;

import java.lang.annotation.*;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 11:00
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JcoEntity {

    /**
     * 接口名
     *
     * @return str
     */
    String interfaceName();

}
