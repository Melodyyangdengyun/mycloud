package com.ydy.mycloud.business.repository;

import com.ydy.mycloud.business.po.CloudFiles;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudFilesRepositoryTest {

    @Autowired
    private CloudFilesRepository cloudFilesRepository;

    @Test
    public void save() {
        CloudFiles cloudFiles = new CloudFiles();
        cloudFiles.setId(5);
        cloudFiles.setCreateDate(DateUtil.now());
        cloudFiles.setUpdateDate(DateUtil.now());
        cloudFiles.setName("测试");
        cloudFiles.setFileName("测试1");
        cloudFilesRepository.save(cloudFiles);
    }

    @Test
    public void findAll() {
        for (CloudFiles cloudFiles : cloudFilesRepository.findAll()) {
            System.out.println(cloudFiles.getName());
        }
    }
}