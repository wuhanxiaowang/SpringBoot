package com.example.demo.config;

/**
 * @ClassName UserNotFindException
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 13:16
 * @ModifyDate 2019/8/17 13:16
 * @Version 1.0
 */
public class UserNotFindException extends RuntimeException {

    public UserNotFindException(){
        super("用户不存在");
    }


}
