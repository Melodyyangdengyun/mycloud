package com.ydy.mycloud.business.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * http返回的对象
 *
 * @ClassName CloudFilesVo
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/9 17:44
 * @Version 1.0
 **/
@Data
public class CloudFilesVo {

    /** 返回的JSON数据为 name **/
    @JsonProperty("name")
    private String name;

    /** 返回的JSON数据为 fileName**/
    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("price")
    private BigDecimal price;
}
