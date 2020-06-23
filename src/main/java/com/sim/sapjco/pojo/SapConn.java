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
    private String JCO_ASHOST;
    // SAP系统编号
    private String JCO_SYSNR;
    // SAP集团
    private String JCO_CLIENT;
    // SAP用户名
    private String JCO_USER;
    // SAP密码
    private String JCO_PASSWD;
    // SAP登录语言
    private String JCO_LANG;
    // 最大连接数
    private String JCO_POOL_CAPACITY;
    // 最大连接线程
    private String JCO_PEAK_LIMIT;
    // SAP ROUTER
    private String JCO_SAPROUTER;
}
