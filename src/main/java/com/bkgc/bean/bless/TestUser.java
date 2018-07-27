package com.bkgc.bean.bless;

import lombok.Data;

import java.util.Date;

@Data
public class TestUser {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 版本
     */
    private String version;

    /**
     * 状态【0禁用】【1可用】
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

}