package com.ydy.mycloud.business.controller;

import com.alibaba.fastjson.JSONReader;
import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.service.CloudFilesService;
import com.ydy.mycloud.sys.po.Result;
import com.ydy.mycloud.sys.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/cloudFiles")
public class CloudFilesController {

    @Autowired
    private CloudFilesService cloudFilesService;

    @ResponseBody
    @GetMapping(value = "/all")
    public Result<List<CloudFiles>> getAll() {
        return ResultUtil.success(cloudFilesService.getAll());
    }
}
