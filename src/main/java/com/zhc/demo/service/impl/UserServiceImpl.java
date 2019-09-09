package com.zhc.demo.service.impl;

import com.zhc.demo.dao.UserEntityMapper;
import com.zhc.demo.entity.UserEntity;
import com.zhc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public List<UserEntity> findUserAll() {
        return userEntityMapper.findUserAll();
    }

    @Override
    public UserEntity checkIsSuccess(String userName, String password) {

        UserEntity userEntity = userEntityMapper.findUserByNameAndPwd(userName, password);

        return userEntity;
    }
}
