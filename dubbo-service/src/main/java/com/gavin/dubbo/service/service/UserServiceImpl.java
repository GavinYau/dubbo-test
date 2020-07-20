package com.gavin.dubbo.service.service;

import com.gavin.dubbo.api.service.UserService;
import com.gavin.dubbo.model.pojo.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * describe:
 *
 * @author Gavin
 * @date 2019/09/22
 */
@Service(version = "${dubbo.version}")
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        User user = new User();
        user.setId(id);
        user.setUsernmae("gavin");
        return user;
    }

    @Override
    public String getMessage() {
        return "hello world!";
    }
}
