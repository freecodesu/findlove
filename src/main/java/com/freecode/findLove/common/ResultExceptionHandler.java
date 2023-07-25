package com.freecode.findLove.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 默认全局异常处理
 */
@RestControllerAdvice
public class ResultExceptionHandler {

    /**
     * 默认全局异常处理
     * @param e 异常
     * @return Result
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> exception(Exception e){
        return Result.fail(ResultCodeEnum.FAIL.getCode(), e.getMessage());
    }
}
