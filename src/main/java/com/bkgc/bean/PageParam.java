package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageParam implements Serializable {
    private static final long serialVersionUID = -5824110939654622766L;
    private Integer pageNum; //页码
    private Integer pageSize; //每一页大小
    private Integer pageStart;//开始页数
    private String searchParam;//通用搜索字段
    private Integer recordCount; //总条数
    private Integer searchChannelId;//搜索的渠道Id
    private List<?> data; //当前页的数据

    public PageParam(Integer pageStart, Integer pageSize) {
        this.pageStart = pageStart;
        this.pageSize = pageSize;
    }

    public PageParam() {
    }
}
