package com.zhc.demo.controller;

import com.zhc.demo.entity.UserEntity;
import com.zhc.demo.entity.UserLoginLogEntity;
import com.zhc.demo.service.UserLoginLogService;
import com.zhc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserLoginLogService userLoginLogService;

    private UserLoginLogEntity userLoginLogEntity;

    private UserEntity userEntity;

    @RequestMapping(value="user/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value="user/userList",method = RequestMethod.GET)
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

    @RequestMapping(value="user/getUserList", method = RequestMethod.GET)
    public String getUserAll(ModelMap map){
        map.addAttribute("userList", userService.findUserAll());
        return "userList";
    }

    /**
     * Login page
     * @return
     */
    @RequestMapping(value = "user/login", method = RequestMethod.GET)
    public String login(){

        return "login";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "user/login/submit", method = RequestMethod.POST)
    public String loginSubmit(@RequestParam("userName") String userName, @RequestParam("password") String password, HttpServletRequest request){

        System.out.println(userName);
        System.out.println(password);

        UserEntity userEntity = userService.checkIsSuccess(userName, password);
        if(null != userEntity){
            userLoginLogEntity = new UserLoginLogEntity();
            userLoginLogEntity.setLoginTime(new Date());
            userLoginLogEntity.setUserId(userEntity.getId());
            userLoginLogEntity.setLoginEffectTime(new Date());
            userLoginLogService.insert(userLoginLogEntity);
            return "success";
        }

        return "fail";
    }

    public UserLoginLogEntity getUserLoginLogEntity() {
        return userLoginLogEntity;
    }

    public void setUserLoginLogEntity(UserLoginLogEntity userLoginLogEntity) {
        this.userLoginLogEntity = userLoginLogEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
