package com.example.demo.socket;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName client
 * @Description TODO
 * @Author 王炎
 * @Date 2019/8/20 11:46
 * @ModifyDate 2019/8/20 11:46
 * @Version 1.0
 */
public class client {

    public static void main(String[] args) throws Exception{

        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream outputStream = socket.getOutputStream();

      //  BufferedWriter bufferedWriter=new BufferedWriter();

        while (true){



        }

    }





}
