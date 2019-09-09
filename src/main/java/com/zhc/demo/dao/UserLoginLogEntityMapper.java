package com.zhc.demo.dao;

import com.zhc.demo.entity.UserLoginLogEntity;

public interface UserLoginLogEntityMapper {
    int insert(UserLoginLogEntity record);

    int insertSelective(UserLoginLogEntity record);
}