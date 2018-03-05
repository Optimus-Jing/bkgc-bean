package com.bkgc.bean.security;

import com.bkgc.bean.PageParam;

public class AuthRolePermission extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3042653646989892381L;

	private String id;

    private String roleid;

    private String permissionid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }
}