package com.test.dubbo.api.interfaces;

import com.test.dubbo.api.entities.User;

import java.util.List;


public interface UserService {
    String getUserNameById(long id);

    User getUserByName(String name);

    List<User> getUserList(List<Integer> list);
}
