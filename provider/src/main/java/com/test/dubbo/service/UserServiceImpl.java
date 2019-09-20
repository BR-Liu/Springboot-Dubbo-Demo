package com.test.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.dubbo.api.entities.User;
import com.test.dubbo.api.interfaces.UserService;

import java.util.LinkedList;
import java.util.List;

@Service(version = "0.0.1")
public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(long id) {
        return "my name is gosling" + id;
    }

    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setId(1L);
        user.setName(name);
        user.setAge(24);
        return user;
    }

    @Override
    public List<User> getUserList(List<Integer> list) {
        List<User> users = new LinkedList<User>();
        for (Integer i : list) {
            users.add(new User(i,"jack" + i,24));
        }
        return users;
    }
}
