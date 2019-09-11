package com.test.dubbo.api.interfaces;

import com.test.dubbo.api.entries.User;


public interface UserService {
    String getUserNameById(long id);

    User getUserByName(String name);
}
