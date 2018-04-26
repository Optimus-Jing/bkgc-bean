package com.bkgc.bean.machine;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Scene implements Serializable {
    private static final long serialVersionUID = 5424721918951736591L;

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private String description;

}