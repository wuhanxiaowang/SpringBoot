package com.example.demo.zk;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
//@Component
public class WrapperZk {
    @Value("${curator.retryCount}")
    private String retryCount;
    @Value("${curator.elapsedTimeMs}")
    private String elapsedTimeMs;
    @Value("${curator.connectString}")
    private String connectString;
    @Value("${curator.sessionTimeoutMs}")
    private String sessionTimeoutMs;
    @Value("${curator.connectionTimeoutMs}")
    private String connectionTimeoutMs;
}
