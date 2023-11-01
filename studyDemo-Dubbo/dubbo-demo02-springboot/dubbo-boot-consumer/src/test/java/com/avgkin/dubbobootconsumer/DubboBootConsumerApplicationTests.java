package com.avgkin.dubbobootconsumer;

import com.avgkin.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboBootConsumerApplicationTests {

	@DubboReference
	private UserService userService;
	@Test
	void contextLoads() {
		boolean login = userService.login("avgkin", "123456");
		System.out.println(login);
	}

}
