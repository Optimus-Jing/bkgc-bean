package com.bkgc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchBean {
    private int  pageNum;
    private int  pageSize;
    private String moduleId;

    private String name;
    private String phone;
    private String startDateTime;
    private String endDateTime;

    private Integer type;
    private Integer status;


    public SearchBean(int pageSize, int pageNum) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public SearchBean(int pageNum, int pageSize, String moduleId) {
        this(pageSize,pageNum);
        this.moduleId = moduleId;
    }
}
