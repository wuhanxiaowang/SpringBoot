package com.example.demo.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName CommonResponse
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/20 23:19
 * @ModifyDate 2019/8/20 23:19
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code,String message){
         this.code=code;
         this.message=message;

    }
}
