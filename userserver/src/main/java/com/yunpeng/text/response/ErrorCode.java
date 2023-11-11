package com.yunpeng.text.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    ERROR_CODE(500,"系统异常"),
    REGISTER_NO_USERNAME(301,"用户名必填"),
    REGISTER_USER_EXISTS(300,"用户已存在"),
    LOGIN_ERROR(400,"登录用户名不存在");

    private Integer code;
    private String message;
}
