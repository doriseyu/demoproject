package com.yunpeng.text.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

/**
 * @author kongdehui
 * @date 2019/04/22 23:06
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class ValidateException extends RuntimeException {

    private Map<String, String> errors;

    public ValidateException(Map<String, String> errors) {
        this.errors = errors;
    }
}
