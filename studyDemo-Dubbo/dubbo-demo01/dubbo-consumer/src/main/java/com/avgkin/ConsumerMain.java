package com.avgkin;

import com.avgkin.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        boolean login = userService.login("avgkin", "123456");
        System.out.println(login);
    }
}
