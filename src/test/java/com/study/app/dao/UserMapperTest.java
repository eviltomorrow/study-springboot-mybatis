package com.study.app.dao;

import org.junit.Test;

import com.study.app.BaseTest;
import com.study.app.pojo.User;

import jakarta.annotation.Resource;

public class UserMapperTest extends BaseTest {
    @Resource
    private UserMapper mapper;

    @Test
    public void testHello() {
        System.out.println("Hello world");
    }

    @Test
    public void testGetById() {
        User user = mapper.getUserById(1);
        if (user != null) {
            System.out.println(user.getUsername());
        }

    }
}
