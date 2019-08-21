package com.example.demo.ad.advice;

import com.example.demo.ad.exception.AdException;
import com.example.demo.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


/**
 * @ClassName GlobalExceptionAdvice
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/20 23:43
 * @ModifyDate 2019/8/20 23:43
 * @Version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req, AdException ex){

        CommonResponse<String> response=new CommonResponse<>(-1,"business error");

        response.setData(ex.getMessage());
        return response;
    }
}
