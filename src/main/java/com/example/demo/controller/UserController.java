package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/demo/user")
public class UserController {
    @Autowired
    UserService userService;
    @Resource
    UserDao userDao;
    @RequestMapping("/hello")
    public String hello(){


        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("age",27);
        List<User> userList = userService.list(userQueryWrapper);

        IPage<User> userIPage = userDao.selectPage(new Page<User>(2,10),userQueryWrapper);

        List<User> records = userIPage.getRecords();


        return JSON.toJSONString(records);
    }
}

