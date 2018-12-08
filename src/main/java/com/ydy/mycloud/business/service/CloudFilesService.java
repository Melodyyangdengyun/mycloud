package com.ydy.mycloud.business.service;

import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.repository.CloudFilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
