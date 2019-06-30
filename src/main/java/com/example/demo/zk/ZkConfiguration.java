package com.example.demo.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

//@Configuration
public class ZkConfiguration {
    @Autowired
    WrapperZk wrapperZk;

    @Bean(initMethod = "start")
    public CuratorFramework curatorFramework() {
        return CuratorFrameworkFactory.newClient(
                wrapperZk.getConnectString(),
                Integer.valueOf(wrapperZk.getSessionTimeoutMs()),
                Integer.valueOf(wrapperZk.getConnectionTimeoutMs()),
                new RetryNTimes(Integer.valueOf(wrapperZk.getRetryCount()),Integer.valueOf(wrapperZk.getElapsedTimeMs())));
    }

}
