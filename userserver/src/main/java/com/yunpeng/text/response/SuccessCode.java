package com.yunpeng.text.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessCode {

    SUCCESS(200, "成功");


    private Integer code;
    private String message;
}
