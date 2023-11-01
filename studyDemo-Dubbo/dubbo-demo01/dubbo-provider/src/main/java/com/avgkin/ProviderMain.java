package com.avgkin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

public class ProviderMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        classPathXmlApplicationContext.start();
        new CountDownLatch(1).await();
    }
}
