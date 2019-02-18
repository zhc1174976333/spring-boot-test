package com.zhc.demo.controller;

import com.zhc.demo.entity.UserEntity;
import com.zhc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(){
        return "123";
    }

    @RequestMapping(value="/userList",method = RequestMethod.GET)
    public String findUserAll(){
        List<UserEntity> userEntityList = userService.findUserAll();
        if(CollectionUtils.isEmpty(userEntityList)){
            return "info list is empty!";
        }
        StringBuffer msg = new StringBuffer();
        for(UserEntity user : userEntityList){
            msg.append(user.getUserName());
            msg.append(",");
            msg.append(user.getPassword());
            msg.append(";");
        }
        return msg.toString();
    }
}
