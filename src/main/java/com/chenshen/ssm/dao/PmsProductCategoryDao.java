package com.chenshen.ssm.dao;

import com.chenshen.ssm.pojo.PmsProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PmsProductCategoryDao {
    @Insert("insert into pms_product_category(parent_id, name, level, product_count, product_unit, nav_status, show_status, sort, icon, keywords, description) " +
            "VALUE (#{parent_id},#{name},#{level},#{product_count},#{product_unit},#{nav_status},#{show_status},#{sort},#{icon},#{keyword},#{description});")
    int insertPmsProductCategory(PmsProductCategory pmsProductCategory);

    @Delete("delete from pms_product_category where id=#{id};")
    int deletePmsProductCategoryById(long id);

    @Update("update pms_product_category set " +
            "parent_id=#{parent_id},name=#{name},level=#{level},product_count=#{product_count},product_unit=#{product_unit}" +
            ",nav_status=#{nav_status},show_status=#{show_status},sort=#{sort},icon=#{icon},keywords=#{keyword},description=#{description} " +
            "where id=#{id};")
    int updatePmsProductCategory(PmsProductCategory pmsProductCategory);

    @Select("select id, parent_id, name, level, product_count, " +
            "product_unit, nav_status, show_status, sort, icon, keywords, description" +
            " from pms_product_category where id=#{id};")
    PmsProductCategory selectPmsProductCategoryById(long id);

    @Select("select id, parent_id, name, level, product_count, " +
            "product_unit, nav_status, show_status, sort, icon, keywords, description" +
            " from pms_product_category ;")
    List<PmsProductCategory> selectPmsProductCategoryAll();
}
