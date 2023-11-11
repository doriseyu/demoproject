package com.yunpeng.text.response;

/**
 * @author kordar
 * @date 2021/04/18 22:31
 **/
public class ResultGenerator {

    /**
     * @return com.xiaositea.admin.response.ResultGenerator.Result<java.lang.String>
     * @author kordar
     * @date 2021/04/18 22:47
     */
    public static Result<String> success() {
        return new Result<>(SuccessCode.SUCCESS.getCode(), SuccessCode.SUCCESS.getMessage(), "");
    }

    /**
     * @param message
     * @return com.xiaositea.admin.response.ResultGenerator.Result<java.lang.String>
     * @author kordar
     * @date 2021/04/18 22:47
     */
    public static Result<String> success(String message) {
        return new Result<>(SuccessCode.SUCCESS.getCode(), message, "");
    }

    /**
     * @param message
     * @param data
     * @return com.xiaositea.admin.response.ResultGenerator.Result<T>
     * @author kordar
     * @date 2021/04/18 22:47
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(SuccessCode.SUCCESS.getCode(), message, data);
    }

    /**
     * @param data
     * @return com.xiaositea.admin.response.Result<T>
     * @author kongdehui
     * @date 2021/04/20 21:47
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(SuccessCode.SUCCESS.getCode(), SuccessCode.SUCCESS.getMessage(), data);
    }

    /**
     * 带数据的查询结构
     *
     * @param data
     * @param count
     * @return com.xiaositea.admin.response.ResultData<T>
     * @author kongdehui
     * @date 2021/04/21 21:32
     */
    public static <T> ResultData<T> successData(T data, long count) {
        return new ResultData<>(SuccessCode.SUCCESS.getCode(), SuccessCode.SUCCESS.getMessage(), data, count);
    }

    /**
     * @param message
     * @return com.xiaositea.admin.response.Result<java.lang.String>
     * @author kongdehui
     * @date 2021/04/21 13:35
     */
    public static Result<String> error(String message) {
        return new Result<>(ErrorCode.ERROR_CODE.getCode(), message, "");
    }

    /**
     * @param errorCode
     * @return com.xiaositea.admin.response.ResultGenerator.Result<java.lang.String>
     * @author kordar
     * @date 2021/04/18 22:47
     */
    public static Result<String> error(ErrorCode errorCode) {
        return new Result<>(errorCode.getCode(), errorCode.getMessage(), "");
    }

    /**
     * @param errorCode
     * @param data
     * @return com.xiaositea.admin.response.ResultGenerator.Result<T>
     * @author kordar
     * @date 2021/04/18 22:47
     */
    public static <T> Result<T> error(ErrorCode errorCode, T data) {
        return new Result<>(errorCode.getCode(), errorCode.getMessage(), data);
    }

    public static Result<String> error(Integer code, String message) {
        return new Result<>(code, message, "");
    }

    /**
     * @param flag
     * @param successMessage
     * @param errorMessage
     * @return com.xiaositea.admin.response.Result<java.lang.String>
     * @author kongdehui
     * @date 2021/04/21 13:35
     */
    public static Result<String> successOrError(boolean flag, String successMessage, String errorMessage) {
        if (flag) {
            return success(successMessage);
        } else {
            return error(errorMessage);
        }
    }
}
