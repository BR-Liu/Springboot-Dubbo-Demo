package com.test.dubbo.api.entries;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private long id;
    private String name;
    private int age;
}
