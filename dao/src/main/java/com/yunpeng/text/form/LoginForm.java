package com.yunpeng.text.form;

import lombok.Data;

@Data
public class LoginForm {
    /**
     * id当成密码来用
     */
    private int id;
    private String username;
}
