package com.example.demo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;


public class TestJob1 implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("111111111111111");
    }
}
