package com.ydy.mycloud.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @ClassName DataPo
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/8 12:38
 * @Version 1.0
 **/
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class DataPo<T> extends BasePo<T> {
    @Column(name = "create_date",nullable = false)
    private Date createDate;	// 创建日期
    @Column(name = "update_date",nullable = false)
    private Date updateDate;    // 更新日期
}
