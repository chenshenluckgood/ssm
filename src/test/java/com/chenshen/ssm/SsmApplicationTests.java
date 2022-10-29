package com.chenshen.ssm;

import com.chenshen.ssm.service.PmsProductCategoryService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SsmApplicationTests {

    private static final Logger log = new LoggerFactory().getLogger(SsmApplicationTests.class);

    @Autowired
    private PmsProductCategoryService pmsProductCategoryService;

    @Test
    void contextLoads() {
        log.warn(pmsProductCategoryService.peekPmsProductCategoryById(Integer.toUnsignedLong(1)).toString());
    }

}
