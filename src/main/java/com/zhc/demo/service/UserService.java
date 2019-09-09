package com.zhc.demo.service;

import com.zhc.demo.entity.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<UserEntity> findUserAll();

    UserEntity checkIsSuccess(String userName, String password);

}
