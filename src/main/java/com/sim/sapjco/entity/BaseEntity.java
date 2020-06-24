package com.sim.sapjco.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 11:10
 */
@Data
public class BaseEntity {
    private int id;
    private boolean deleteflag = false;
    private Date createDate = new Date();

}
