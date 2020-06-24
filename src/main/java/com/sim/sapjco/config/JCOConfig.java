package com.sim.sapjco.config;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 10:31
 */
@Configuration
public class JCOConfig {

    private static final String ABAP_AS_POOLED = "ABAP_AS_WITH_POOL";

    /**
     * 获取jco 连接
     *
     * @return
     * @throws JCoException
     */
    @Bean
    public JCoDestination jCoDestination() throws JCoException {
        return JCoDestinationManager.getDestination(ABAP_AS_POOLED);
    }


}
