package com.gavin.dubbo.web;

import com.gavin.dubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboWebApplicationTests {

    @Reference(version = "${dubbo.version}")
    UserService userService;

    @Test
    public void contextLoads() {
        String message = userService.getMessage();
        System.out.println(message);

    }

}
