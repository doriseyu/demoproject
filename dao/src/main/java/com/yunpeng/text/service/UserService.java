package com.yunpeng.text.service;

import com.yunpeng.text.entity.User;
import org.springframework.stereotype.Service;

import java.util.Date;


public interface UserService {
    //country_id 设置为0，create_time 获取当前系统时间即可
    public Boolean add(String username, int gender, Date birthday);
    public User findUserById(int id);
    public int findIdByUserName(String username);
    public long countUserDay(Date date);
}
