package com.yyy.dubbo;

/**
 * @author yinyiyun
 * @date 2018/5/24 8:59
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
