package com.yyy.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinyiyun
 * @date 2018/5/24 9:46
 */
public class TestServer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("server.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
    }

}
