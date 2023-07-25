package com.freecode.findLove.common;

import lombok.Getter;

/**
 * 返回值状态枚举
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"success"),
    FAIL(500, "fail");
    private final int code;
    private final String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
