package com.example.demo.socket;


import java.net.ServerSocket;

/**
 * @ClassName server
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/20 11:46
 * @ModifyDate 2019/8/20 11:46
 * @Version 1.0
 */
public class server {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket=new ServerSocket(8888);

        serverSocket.accept();

        System.out.println("连接成功........");







    }

}
