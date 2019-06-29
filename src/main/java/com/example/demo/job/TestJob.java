package com.example.demo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob implements SimpleJob {
    Logger logger = LoggerFactory.getLogger(TestJob.class);
    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("我是一个定时任务");
    }
}
