package com.ydy.mycloud.business.po;

import com.ydy.mycloud.sys.DataPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @ClassName CloudFiles
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/8 12:19
 * @Version 1.0
 **/
@Entity
@Table(name = "cloud_files")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CloudFiles extends DataPo<CloudFiles> {
    private static final long serialVersionUID = -3667023814036080394L;
    @NotNull(message = "名称不能为空")
    @Column(name = "name",nullable = false)
    private String name;
    @NotNull(message = "文件名不能为空")
    @Column(name = "file_name",nullable = false)
    private String fileName;

    public CloudFiles(Integer id) {
        this.id = id;
    }
}
