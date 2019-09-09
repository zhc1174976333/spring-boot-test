package com.zhc.demo.dao;

import com.zhc.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserEntityMapper {
    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> findUserAll();

    UserEntity findUserByNameAndPwd(@Param("userName") String userName, @Param("password") String password);
}