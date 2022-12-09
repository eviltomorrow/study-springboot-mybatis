package com.study.app.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.app.pojo.User;

@Mapper
public interface UserMapper {
    User getById(@Param("id") int id);
}
