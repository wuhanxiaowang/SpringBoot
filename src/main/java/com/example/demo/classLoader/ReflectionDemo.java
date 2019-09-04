package com.example.demo.classLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName ReflectionDemo
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/21 22:23
 * @ModifyDate 2019/8/21 22:23
 * @Version 1.0
 */
public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, "Java反射机制实例");
        list.add(2222);
        System.out.println(list);


    }


}
