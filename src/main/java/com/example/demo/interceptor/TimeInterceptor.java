package com.example.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TimeInterceptor
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/17 13:41
 * @ModifyDate 2019/8/17 13:41
 * @Version 1.0
 */
//@Component
public class TimeInterceptor implements HandlerInterceptor {


    /**
       @Description 调用controller方法前起作用
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        return false;
    }

    /**
       @Description 调用controller方法中启作用,异常就不起作用
    */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    /**
       @Description 不管异常还是不异常都起作用
    */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
