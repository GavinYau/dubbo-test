package com.gavin.dubbo.web.controller;

import com.gavin.dubbo.api.service.UserService;
import com.gavin.dubbo.model.pojo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe:
 *
 * @author Gavin
 * @date 2019/09/22
 */
@RestController
public class UserController {
    @Reference(version = "${dubbo.version}")
    UserService userService;

    @GetMapping("message")
    public String getMessage() {
        return userService.getMessage();
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
