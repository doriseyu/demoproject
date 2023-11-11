package com.yunpeng.text.service;

import com.yunpeng.text.entity.User;
import com.yunpeng.text.form.LoginForm;
import com.yunpeng.text.form.RegisterForm;
import com.yunpeng.text.response.ErrorCode;
import com.yunpeng.text.response.ResponseException;
import com.yunpeng.text.response.ResultData;
import com.yunpeng.text.response.ResultGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class YpUserService {

    @Resource
    UserService userService;

    public Boolean register(RegisterForm f){
        if (f.getUsername() == null || f.getUsername().equals("")){
            throw new ResponseException(ErrorCode.REGISTER_NO_USERNAME);
        }
        else return userService.add(f.getUsername(),f.getGender(),f.getBirthday());
    }

    public User login(LoginForm f){
        User user = userService.findUserById(f.getId());
        if (user.getUsername().equals(f.getUsername()))
            return user;
        else throw new ResponseException(ErrorCode.LOGIN_ERROR);
    }

    public User info(int id){
        return userService.findUserById(id);
    }

    public int findIdByRegister(RegisterForm f){
        return userService.findIdByUserName(f.getUsername());
    }

    public long count(String date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        date +=" 00:00:00";
        Date start = new Date();
        try {
            start = dateFormat.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return userService.countUserDay(start);
    }
}
