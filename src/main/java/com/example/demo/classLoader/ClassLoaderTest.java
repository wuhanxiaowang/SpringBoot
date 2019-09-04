package com.example.demo.classLoader;

/**
 * @ClassName ClassLoaderTest
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/21 21:09
 * @ModifyDate 2019/8/21 21:09
 * @Version 1.0
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);
    }


}


class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    public static int count1;

    public static int count2 = 0;

    static{

        System.out.println("类初始化阶段执行我");
    }



    private SingleTon() {
        count1++;
        count2++;
    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}