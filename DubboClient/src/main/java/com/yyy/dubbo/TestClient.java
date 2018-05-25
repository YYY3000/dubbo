package com.yyy.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinyiyun
 * @date 2018/5/24 9:47
 */
public class TestClient {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
        context.start();
        System.out.println("consumer start");
        HelloService demoService = (HelloService)context.getBean("helloService");
        System.out.println("consumer");
        System.out.println(demoService.hello("yyy"));
    }

}
