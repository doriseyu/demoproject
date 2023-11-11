package com.yunpeng.text.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yunpeng.text.entity.User;
import com.yunpeng.text.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean add(String username, int gender, Date birthday){
        User user = new User();
        user.setUsername(username);
        user.setGender(gender);
        user.setBirthday(birthday);
        user.setCountryId(0);
        if (userMapper.insert(user)==1){
            return true;
        }
        else return false;
    }

    @Override
    public User findUserById(int id){
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public int findIdByUserName(String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",username);
        List<Map<String,Object>> userList = userMapper.selectMaps(queryWrapper);
        int last = userList.size()-1;
        Map<String,Object> map = userList.get(last);
        User user=new User();
        user.setId(Integer.parseInt(String.valueOf(map.get("id"))));
        return user.getId();
    }

    @Override
    public long countUserDay(Date start) {
        Date end = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(start);
        calendar.add(Calendar.DAY_OF_YEAR,1);
        end = calendar.getTime();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("create_time",start,end);
        long count = (long) userMapper.selectCount(queryWrapper);
        return count;
    }
}
