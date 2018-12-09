package com.ydy.mycloud.business.service;

import com.sun.xml.internal.bind.v2.TODO;
import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.repository.CloudFilesRepository;
import com.ydy.mycloud.sys.enums.ResultEnum;
import com.ydy.mycloud.sys.exception.MyCloudException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CloudFilesService
 * @Description TODO
 * @Author DiYun
 * @Date 2018/12/8 14:41
 * @Version 1.0
 **/
@Service
public class CloudFilesService {
    @Autowired
    private CloudFilesRepository cloudFilesRepository;

    public List<CloudFiles> getAll() {
        return cloudFilesRepository.findAll();
    }

    public CloudFiles findOne(Integer id) {
        return cloudFilesRepository.findOne(Example.of(new CloudFiles(id))).get();
    }

    public CloudFiles save(CloudFiles cloudFiles) {
        return cloudFilesRepository.save(cloudFiles);
    }

    public void getName(Integer id) {
        CloudFiles cloudFiles = cloudFilesRepository.findOne(Example.of(new CloudFiles(id))).get();
        if (cloudFiles.getName().equals("测试")) {
            throw new MyCloudException(ResultEnum.ERROR); //未知错误
        }
    }
}
