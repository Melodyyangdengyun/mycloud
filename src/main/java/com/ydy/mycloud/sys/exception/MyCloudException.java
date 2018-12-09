package com.ydy.mycloud.sys.exception;

import com.ydy.mycloud.sys.enums.ResultEnum;
import lombok.Data;

/**
 * @ClassName MyCloudException
 * @Author DiYun
 * @Date 2018/12/9 11:45
 * @Version 1.0
 **/
@Data
public class MyCloudException extends RuntimeException {
    private Integer code;

    public MyCloudException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
