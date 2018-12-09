package com.ydy.mycloud.sys.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * DiYun
 * 2018/12/9
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {
    ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    ;
    private Integer code;
    private String msg;
}
