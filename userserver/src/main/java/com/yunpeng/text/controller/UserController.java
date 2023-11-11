package com.yunpeng.text.controller;

import com.yunpeng.text.entity.User;
import com.yunpeng.text.form.LoginForm;
import com.yunpeng.text.form.RegisterForm;
import com.yunpeng.text.request.CountUser;
import com.yunpeng.text.request.InfoId;
import com.yunpeng.text.response.*;
import com.yunpeng.text.service.UserService;
import com.yunpeng.text.service.YpUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private YpUserService ypUserService;

    //用于显示页面内容
    private String print;

    @PostMapping("register")
    public Result<?> register(@RequestBody RegisterForm f){
        if (ypUserService.register(f)) {
            int id =ypUserService.findIdByRegister(f);
            return ResultGenerator.success("register success",id);
        }else {
            return ResultGenerator.error("注册失败");
        }
    }

    @PostMapping("login")
    public Result<?> login(@RequestBody LoginForm f){
            User user = ypUserService.login(f);
            return ResultGenerator.success("login success",user);
    }

    @GetMapping("info")
    public Result<User> info(@RequestBody InfoId id){
        User user = ypUserService.info(id.getId());
        return ResultGenerator.success(user);
    }

    @GetMapping("count")
    public Result<?> count(@RequestBody CountUser start){
        start.setCount(ypUserService.count(start.getDate()));
        return ResultGenerator.success(start);
    }
}
