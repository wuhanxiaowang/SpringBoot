package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.config.UserNotFindException;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.HelloEntity;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wy
 * @since 2019-06-29
 */
@RestController
@RequestMapping("/demo")
public class UserController {
    private static final Integer PEICE = 20;
    final Integer PRICE=20;
    @Autowired
    UserService userService;
    @Resource
    UserDao userDao;
    @RequestMapping("/hello")
    public String hello(){


        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("phone","15171411232");
        User user = userDao.selectOne(userQueryWrapper);
        if(user==null || user.getAge()<PEICE){
            return "库存不足12";

        }
            user.setAge(user.getAge()-20);

            userService.updateById(user);
        return JSON.toJSONString(user);
    }
    @RequestMapping("/hello1")
    public String hello1(){

        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("phone","15171411232");
        User user = userDao.selectOne(userQueryWrapper);
        if(user==null || user.getAge()<PEICE){

            return "库存不足2";
        }
        user.setAge(user.getAge()-20);
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        userService.updateById(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/hello2")
    public String hello2(){
        throw new UserNotFindException();
    }


    @RequestMapping("/hello3")
    public String hello3(@RequestBody @Validated HelloEntity helloEntity, BindingResult error){
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("\n");
        if(error.hasErrors()){
            List<ObjectError> allErrors = error.getAllErrors();
            for(ObjectError o:allErrors){
                sBuilder.append(o.getDefaultMessage());
                sBuilder.append("\n");
            }
            return sBuilder.toString();
        }

        return "ok";
    }

}

