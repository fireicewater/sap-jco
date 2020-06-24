package com.sim.sapjco.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sim.sapjco.dao.JobAndTriggerMapper;
import com.sim.sapjco.entity.JobAndTrigger;
import com.sim.sapjco.service.JobAndTriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangnaiqi
 * @version 1
 * @date 2020/6/24 13:48
 */
@Service
public class JobAndTriggerImpl implements JobAndTriggerService {

    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;

    @Override
    public IPage<JobAndTrigger> getJobAndTriggerDetails(Page<JobAndTrigger> page) {

        return jobAndTriggerMapper.getJobAndTriggerDetails(page);
    }
}
