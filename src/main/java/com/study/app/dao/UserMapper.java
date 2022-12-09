package com.study.app.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.app.pojo.User;

@Mapper
public interface UserMapper {
    User getUserById(@Param("id") int id);
    User getUserGameById(@Param("id") int id);
}
