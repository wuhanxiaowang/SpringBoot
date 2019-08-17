package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 18:23
 * @ModifyDate 2019/8/17 18:23
 * @Version 1.0
 */
@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping("/index")
    public String hello(){

        return "index";
    }
}
