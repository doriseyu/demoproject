package com.yunpeng.text.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 公共Exception
 *
 * @author kongdehui
 * @date 2021/04/20 20:29
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseException extends RuntimeException {

    private ErrorCode errorCode;

    public ResponseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.setErrorCode(errorCode);
    }
}
