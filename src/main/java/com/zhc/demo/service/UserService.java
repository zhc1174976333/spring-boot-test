package com.zhc.demo.service;

import com.zhc.demo.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findUserAll();
}
