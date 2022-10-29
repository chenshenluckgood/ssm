package com.chenshen.ssm.service;

import com.chenshen.ssm.pojo.PmsProductCategory;

import java.util.List;


public interface PmsProductCategoryService {

    boolean savePmsProductCategory(PmsProductCategory pmsProductCategory);

    boolean dropPmsProductCategoryById(long id);

    boolean modifyPmsProductCategory(PmsProductCategory pmsProductCategory);

    PmsProductCategory peekPmsProductCategoryById(long id);

    List<PmsProductCategory> peekPmsProductCategoryAll();
}
