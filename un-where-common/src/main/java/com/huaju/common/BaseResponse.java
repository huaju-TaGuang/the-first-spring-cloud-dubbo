package com.huaju.common;

/**
 * 通用响应对象
 * 
 * @param <T> 响应数据的类型
 */
public class BaseResponse<T> {
    private Integer code;
    private String message;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}