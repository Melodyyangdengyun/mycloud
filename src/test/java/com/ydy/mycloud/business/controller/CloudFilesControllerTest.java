package com.ydy.mycloud.business.controller;

import com.ydy.mycloud.business.service.CloudFilesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CloudFilesControllerTest {

    @Autowired
    private CloudFilesService cloudFilesService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getAll() throws Exception {
        cloudFilesService.getAll();
        mvc.perform(MockMvcRequestBuilders.get("/getAll"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("abc"));
    }
}