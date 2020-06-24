package com.sim.sapjco.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 13:44
 */
public interface BaseJob {
    public void execute(JobExecutionContext context) throws JobExecutionException;
}
