package com.study.app.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.study.app.pojo.User;

@Repository
public interface UserMapper {
    User getById(@Param("id") int id);
}
