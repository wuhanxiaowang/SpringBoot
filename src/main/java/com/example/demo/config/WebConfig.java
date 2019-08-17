package com.example.demo.config;


import com.example.demo.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 13:49
 * @ModifyDate 2019/8/17 13:49
 * @Version 1.0
 */
//@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    TimeInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }
}
