package com.freecode.findLove.common;

import lombok.Data;

/**
 * 统一返回值
 * @param <T>
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;
    private Long timestamp;

    public Result() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<T>();
        result.setData(data);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMsg(ResultCodeEnum.SUCCESS.getMsg());
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }

    public static <T> Result<T> fail(int code, String message){
        Result<T> result = new Result<T>();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

}
