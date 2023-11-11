package com.yunpeng.text.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoVo {
    private int id;
    private String username;
    private int gender;
    private int countryId;
    private Date birthday;
    private Date createTime;
}
