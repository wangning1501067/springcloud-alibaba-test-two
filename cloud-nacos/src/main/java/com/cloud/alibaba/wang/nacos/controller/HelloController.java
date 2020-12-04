package com.cloud.alibaba.wang.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ace Lee
 * @Date: 2019/3/14 14:14
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name) throws InterruptedException {
        //模拟熔断
        Thread.sleep(10 * 1000);
        return "Hello "+name+", this is nacos-provider message.";
    }
}
