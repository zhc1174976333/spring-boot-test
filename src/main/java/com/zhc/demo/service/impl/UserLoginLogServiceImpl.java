package com.zhc.demo.service.impl;

import com.zhc.demo.dao.UserLoginLogEntityMapper;
import com.zhc.demo.entity.UserLoginLogEntity;
import com.zhc.demo.service.UserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginLogServiceImpl implements UserLoginLogService {

    @Autowired
    private UserLoginLogEntityMapper userLoginLogEntityMapper;

    @Override
    public void insert(UserLoginLogEntity userLoginLogEntity) {
        userLoginLogEntityMapper.insert(userLoginLogEntity);
    }
}
