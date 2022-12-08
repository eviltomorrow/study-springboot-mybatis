package com.study.app.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void testGetById(){
        mapper.getById(0);
    }
}
