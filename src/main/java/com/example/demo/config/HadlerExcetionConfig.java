package com.example.demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HadlerExcetionConfig
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 13:12
 * @ModifyDate 2019/8/17 13:12
 * @Version 1.0
 */
//@ControllerAdvice
public class HadlerExcetionConfig {


    @ResponseBody
    @ExceptionHandler(UserNotFindException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> hadleUserNotFindException(UserNotFindException u) {
        Map<String,Object> map=new HashMap<>();
        map.put("message",u.getMessage());
        return map;


    }


}
