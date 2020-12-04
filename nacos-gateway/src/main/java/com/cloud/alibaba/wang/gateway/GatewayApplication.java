package com.cloud.alibaba.wang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient//能够让注册中心能够发现，扫描到改服务
@RestController
public class GatewayApplication {

    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }

    /**
     * 熔断后跳转的方法
     * @param request
     * @return
     */
    @RequestMapping("/defaultfallback2")
    public String defaultfallback(ServerHttpRequest request){
        return ">>>服务器正在更新,请稍后再试<<<";
    }
}
