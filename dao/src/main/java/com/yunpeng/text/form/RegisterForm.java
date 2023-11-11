package com.yunpeng.text.form;

import lombok.Data;

import java.util.Date;

@Data
public class RegisterForm {
    private String username;
    private int gender;
    private Date birthday;
}
