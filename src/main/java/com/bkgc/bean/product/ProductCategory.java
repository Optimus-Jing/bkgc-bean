package com.bkgc.bean.product;

import lombok.Data;

import java.util.Date;

@Data
public class ProductCategory {
    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private String description;

    private Integer parentId;

}