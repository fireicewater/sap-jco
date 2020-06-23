package com.sim.sapjco.pojo;

import lombok.Data;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/23 13:33
 */
@Data
public class SapConn {
    // SAP服务器
    private String JCO_ASHOST="192.167.100.127";
    // SAP系统编号
    private String JCO_SYSNR="00";
    // SAP集团
    private String JCO_CLIENT="800";
    // SAP用户名
    private String JCO_USER="user1";
    // SAP密码
    private String JCO_PASSWD="sim2020";
    // SAP登录语言
    private String JCO_LANG="zh";
    // 最大连接数
    private String JCO_POOL_CAPACITY="1";
    // 最大连接线程
    private String JCO_PEAK_LIMIT="1";
    // SAP ROUTER
    private String JCO_SAPROUTER="192.167.100.127";
}
