package com.ydy.mycloud.business.controller;

import com.alibaba.fastjson.JSONReader;
import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.service.CloudFilesService;
import com.ydy.mycloud.sys.po.Result;
import com.ydy.mycloud.sys.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @ResponseBody
    @RequestMapping(value = "byId/{id}")
    public Result<CloudFiles> cloudFilesFindOne(@PathVariable("id") Integer id) {
        return ResultUtil.success(cloudFilesService.findOne(id));
    }

    @ResponseBody
    @PostMapping(value = "/add")
    public Result<CloudFiles> cloudFilesAdd(@Valid CloudFiles cloudFiles, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(cloudFilesService.save(cloudFiles));
    }

    /**
     *TODO
     *2018/12/9 12:20
     * 异常搞定
     **/
    @GetMapping(value = "/getName/{id}")
    public void getName(@PathVariable("id") Integer id) {
        cloudFilesService.getName(id);
    }
}
