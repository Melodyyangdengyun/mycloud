package com.ydy.mycloud.sys.po;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @ClassName Result
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/9 10:27
 * @Version 1.0
 **/
@Data
public class Result<T> {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;
}
