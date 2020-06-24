package com.sim.sapjco.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sim.sapjco.dao.JobAndTriggerMapper;
import com.sim.sapjco.entity.JobAndTrigger;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 13:47
 */
public interface JobAndTriggerService {

    IPage<JobAndTrigger> getJobAndTriggerDetails(Page<JobAndTrigger> page);
}
