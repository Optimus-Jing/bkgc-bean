package com.bkgc.bean.security;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class AuthRolePermission extends PageParam {
    private static final long serialVersionUID = 3042653646989892381L;

    private String id;

    private String roleid;

    private String permissionid;

}