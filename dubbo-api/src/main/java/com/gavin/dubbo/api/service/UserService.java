package com.gavin.dubbo.api.service;

import com.gavin.dubbo.model.pojo.User;

import java.util.List;

/**
 * describe:
 *
 * @author Gavin
 * @date 2019/09/22
 */
public interface UserService {
    List<User> getAllUser();

    User getUserById(int id);

    String getMessage();
}
