package com.example.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName HelloEntity
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/29 11:01
 * @ModifyDate 2019/8/29 11:01
 * @Version 1.0
 */
@Data
public class HelloEntity {

    @NotBlank(message = "用户名称不能为空")
    private String name;


    @Range(max = 99,min = 88,message = "至少88岁以上")
    private Integer age;

    private String phone;




}
