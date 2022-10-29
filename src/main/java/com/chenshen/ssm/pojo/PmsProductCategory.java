package com.chenshen.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PmsProductCategory {
    private long id;
    private long parent_id;
    private String name;
    private int level;
    private int product_count;
    private int product_unit;
    private int nav_status;
    private int show_status;
    private int sort;
    private String icon;
    private String keywords;
    private String description;
}
