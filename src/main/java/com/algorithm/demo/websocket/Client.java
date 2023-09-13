package com.algorithm.demo.websocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            //构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            Scanner scanner = new Scanner(System.in);
            String input = "";
            if (scanner.hasNextLine()){
                input=scanner.nextLine();
                System.out.println("输入的数据为：" + input);
            }
            scanner.close();
            bw.write(input+"\n");
            bw.flush();
            //读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器："+mess);

            //1.数组

            //2.字符串

            //3.哈希表
            HashMap<String,String> map = new HashMap<>();

            //4.树

            //5.指针

            //6.栈

            //7.队列

            //8.链表

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (ConnectException e){
            System.out.println("服务器连接失败："+e.getMessage());
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.getMessage();
        }
    }
}