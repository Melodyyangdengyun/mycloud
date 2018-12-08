package com.ydy.mycloud.business.controller;

import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.service.CloudFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CloudFilesController
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/8 14:43
 * @Version 1.0
 **/
@RestController
public class CloudFilesController {

    @Autowired
    private CloudFilesService cloudFilesService;

    @GetMapping(value = "/all")
    public List<CloudFiles> getAll() {
        return cloudFilesService.getAll();
    }
}
