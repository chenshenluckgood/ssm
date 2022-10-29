package com.chenshen.ssm.service.impl;

import com.chenshen.ssm.dao.PmsProductCategoryDao;
import com.chenshen.ssm.pojo.PmsProductCategory;
import com.chenshen.ssm.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    @Autowired
    private PmsProductCategoryDao pmsProductCategoryDao;

    @Override
    public boolean savePmsProductCategory(PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryDao.insertPmsProductCategory(pmsProductCategory) > 0 ? true : false;
    }

    @Override
    public boolean dropPmsProductCategoryById(long id) {
        return pmsProductCategoryDao.deletePmsProductCategoryById(id) > 0 ? true : false;
    }

    @Override
    public boolean modifyPmsProductCategory(PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryDao.updatePmsProductCategory(pmsProductCategory) > 0 ? true : false;
    }

    @Override
    public PmsProductCategory peekPmsProductCategoryById(long id) {
        PmsProductCategory pmsProductCategory = pmsProductCategoryDao.selectPmsProductCategoryById(id);
        return pmsProductCategory != null ? pmsProductCategory : null;
    }

    @Override
    public List<PmsProductCategory> peekPmsProductCategoryAll() {
        List<PmsProductCategory> pmsProductCategories = pmsProductCategoryDao.selectPmsProductCategoryAll();
        return pmsProductCategories.isEmpty() ?  null : pmsProductCategories ;
    }
}
