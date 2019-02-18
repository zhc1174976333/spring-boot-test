package com.zhc.demo.dao;

import com.zhc.demo.entity.UserEntity;

import java.util.List;

public interface UserEntityMapper {
    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> findUserAll();
}