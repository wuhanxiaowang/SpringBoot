package com.example.demo.classLoader;

/**
 * @ClassName Fruit
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/21 21:27
 * @ModifyDate 2019/8/21 21:27
 * @Version 1.0
 */
public class Fruit {

    public Fruit() {
        System.out.println("我是父类构造方法");
    }


    public static int a = 5;

    static {
        System.out.println("我是父类静态代码块");
    }


    {
        System.out.println("我是父类非静态代码块");

    }


    public static void main(String[] args) {

        Fruit fruit=new Apple();

    }
}

class Apple extends Fruit {

    public Apple(){
        System.out.println("我是子类构造方法");
    }

    public static int b = 10;

    static {
        System.out.println("我是子类静态代码块");
    }

    {
        System.out.println("我是子类非静态代码块");

    }

}

