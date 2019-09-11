package com.test.dubbo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.api.entries.User;
import com.test.dubbo.api.interfaces.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class invokeController {

    @Reference(version = "0.0.1")
    UserService userService;


    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestParam("name") String name) {
        return userService.getUserByName(name);
    }
}
