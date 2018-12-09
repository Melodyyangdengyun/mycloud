package com.ydy.mycloud.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ClassName BasePo支持类
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/8 12:40
 * @Version 1.0
 **/
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BasePo<T> implements Serializable {
    private static final long serialVersionUID = -6436389308643022222L;
    /**实体编号（唯一标识）使用自增生成策略*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    protected Integer id;
}
