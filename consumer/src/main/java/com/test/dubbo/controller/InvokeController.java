package com.test.dubbo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bestser.dubbo.dto.OrderDTO;
import com.bestser.dubbo.spi.OrderServiceInterface;

import com.test.dubbo.api.entities.User;
import com.test.dubbo.api.interfaces.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
public class InvokeController {

    @Reference(version = "0.0.1")
    UserService userService;

    @Reference
    OrderServiceInterface orderServiceInterface;


    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestParam("name") String name) {
        return userService.getUserByName(name);
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<User> getUsers() {
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        return userService.getUserList(l);
    }

    @RequestMapping("/getOrder")
    @ResponseBody
    public OrderDTO getOrder(@RequestParam("merchantId") int merchantId, @RequestParam("id") int id) {
        return orderServiceInterface.selectOrder(merchantId, id);
    }
}
