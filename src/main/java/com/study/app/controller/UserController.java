package com.study.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.app.dao.UserMapper;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/index")
    public Object index() {
        return "部署成功";
    }
    @RequestMapping("/mapper")
    public Object mapper() {
        return mapper.getById(1);
    }
}