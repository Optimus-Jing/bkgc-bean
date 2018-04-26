package com.bkgc.bean.bless;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SiteAdministrator {

    private String id;

    private String name;

    private String phone;

    private String email;

    private String loginId;

    private String roleId;

    private String createAdminId;

    private Timestamp createTime;

    private String roleName;

    private int status;

    private String userName;

    private String guid;
}

