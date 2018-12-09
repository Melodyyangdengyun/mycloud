package com.ydy.mycloud.sys.utils;

import com.ydy.mycloud.sys.po.Result;

/**
 * @ClassName ResultUtil
 * @Author DiYun
 * @Date 2018/12/9 10:29
 * @Version 1.0
 **/
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
