package com.sim.sapjco.entity;

import com.sim.sapjco.annotations.JcoEntity;
import com.sim.sapjco.annotations.JcoField;
import lombok.Data;

import java.util.Date;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 10:56
 */
@Data
@JcoEntity(interfaceName = "Z_RFC_WMSLOCDATA")
public class WmsLocdata {


    /**
     * Client
     */
    @JcoField(type = "aa")
    private String mandt;
    /**
     * 工厂
     */
    private String werks;
    /**
     * 库位编号
     */
    private String lgort;


}
