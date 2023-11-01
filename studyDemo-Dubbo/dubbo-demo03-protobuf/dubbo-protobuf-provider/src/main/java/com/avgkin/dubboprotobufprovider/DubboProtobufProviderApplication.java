package com.avgkin.dubboprotobufprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo
public class DubboProtobufProviderApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboProtobufProviderApplication.class, args);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
    }

}
