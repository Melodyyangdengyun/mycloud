package com.ydy.mycloud.business.repository;

import com.ydy.mycloud.business.po.CloudFiles;
import com.ydy.mycloud.business.vo.CloudFilesVo;
import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.DateUtil;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudFilesRepositoryTest {

    @Autowired
    private CloudFilesRepository cloudFilesRepository;

    @Test
    public void save() {
        CloudFiles cloudFiles = new CloudFiles();
        cloudFiles.setId(6);
        cloudFiles.setCreateDate(DateUtil.now());
        cloudFiles.setUpdateDate(DateUtil.now());
        cloudFiles.setName("测试");
        cloudFiles.setFileName("测试1");
        CloudFiles files = cloudFilesRepository.save(cloudFiles);
    }

    @Test
    public void findAll() {
        for (CloudFiles cloudFiles : cloudFilesRepository.findAll()) {
            System.out.println(cloudFiles.getName());
        }
    }

    @Test
    public void findOne() {
        BigDecimal orderPrice = new BigDecimal(BigInteger.ZERO);  //初始等于0
        CloudFilesVo cloudFilesVo = new CloudFilesVo();
        orderPrice = cloudFilesVo.getPrice().multiply(cloudFilesVo.getPrice()).add(orderPrice);
        //multiply 相乘  add  相加

        CloudFiles cloudFiles = new CloudFiles();
        //从 cloudFiles 拷贝到 cloudFilesVo
        BeanUtils.copyProperties(cloudFiles,cloudFilesVo);


        List<String> list = Lists.newArrayList();
        List<String> listA = Lists.newArrayList();
        List<String> listB = Lists.newArrayList();
        //判断空
        if (CollectionUtils.isEmpty(list)) {

        }
         //2个数组取并集
        Collection<String> union = CollectionUtils.union(listA, listB);


        // 并集
        Collection<String> unionList = CollectionUtils.union(listA, listB);
        // 交集
        Collection<String> intersectionList = CollectionUtils.intersection(listA, listB);
        // 是否存在交集
        boolean isContained = CollectionUtils.containsAny(listA, listB);
        // 交集的补集
        Collection<String> disjunctionList = CollectionUtils.disjunction(listA, listB);
        // 集合相减
        Collection<String> subtractList = CollectionUtils.subtract(listA, listB);

        // 排序
        Collections.sort((List<String>) unionList);
        Collections.sort((List<String>) intersectionList);
        Collections.sort((List<String>) disjunctionList);
        Collections.sort((List<String>) subtractList);

    }
}