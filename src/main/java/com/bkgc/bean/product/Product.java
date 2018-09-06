package com.bkgc.bean.product;

import lombok.Data;

import java.util.Date;


@Data
public class Product {
    private Integer id;

    private String name;

    private String shortDescription;

    private String description;

    private String imgUrl;

    private String litimgUrl;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer categoryId;

    private String categoryName;

    private Integer isAudit;

    private Integer maxBonus;

    private Integer price;

    private String createTimeStart;

    private String createTimeEnd;

    private Integer pageStart;

    private Integer pageSize;

    private String images;

    private String themeUrl;

    private String specification;

    private Integer totalPrice;

    private int count;

    private Integer provinceId;

    private String provinceName;

    private Integer denomination;

}