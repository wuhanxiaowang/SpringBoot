package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class RedisControllerTest {

    @Resource
    RedisUtil redisUtil;
    @RequestMapping("/redis")

    public String redisTest() {
        User user=new User();
        user.setAge(2777);
        boolean bing = redisUtil.set("Bing", user);

        return String.valueOf(bing);
    }


}
