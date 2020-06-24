package com.sim.sapjco.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sim.sapjco.entity.JobAndTrigger;

import java.util.List;

/**
 * @author zhangnaiqi
 * @version 1¬
 * @date 2020/6/24 13:43
 */
public interface JobAndTriggerMapper {

    IPage<JobAndTrigger> getJobAndTriggerDetails(Page<JobAndTrigger> page);
}
