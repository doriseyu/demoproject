package com.yunpeng.text.config;

import com.yunpeng.text.response.*;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * @author kongdehui
 * @date 2021/04/20 21:15
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ResponseException.class)
    public Result<String> exceptionHandler(Exception e) {
        return ResultGenerator.error(e.getMessage());
    }

//    @ExceptionHandler(value = ValidateException.class)
//    public Result<String> exceptionHandler2(Exception e) {
//        return ResultGenerator.success(e.getMessage());
//    }
    /*@ExceptionHandler(value = ValidateException.class)
    public Result<Map<String, String>> validateExceptionHandler(ValidateException e) {
        return ResultGenerator.error(ErrorCode.VALIDATOR_ERROR_CODE, e.getErrors());
    }

    @ExceptionHandler(value = ResponseException.class)
    public Result<String> responseExceptionHandler(ResponseException e) {
        ErrorCode errorCode = e.getErrorCode();
        return ResultGenerator.error(errorCode);
    }

    @ExceptionHandler(value = BindException.class)
    public Result<String> validationExceptionHandler(BindException e) {
        String message = "error";
        if (e.getBindingResult().hasErrors()) {
            message = e.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
        }
        return ResultGenerator.error(ErrorCode.VALIDATOR_ERROR_CODE.getCode(), message);
    }*/
}
