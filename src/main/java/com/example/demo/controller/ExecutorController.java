package com.example.demo.controller;

import com.example.demo.service.ExcutorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class ExecutorController {

    @Resource
    ExcutorService excutorService;
    @RequestMapping("/excutor")
    public String executor(){
        excutorService.executeAsync();
        return "ok";
    }
}
