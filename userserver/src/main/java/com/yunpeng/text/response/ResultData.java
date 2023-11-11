package com.yunpeng.text.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 统一返回对象
 *
 * @author kordar
 * @date 2021/04/18 22:50
 **/
@Data
@AllArgsConstructor
public class ResultData<T> {
    private Integer code;
    private String message;
    private T data;
    private long count;
}
