package com.bkgc.bean.security;

import com.bkgc.bean.PageParam;

public class AuthRole extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1542931209146162098L;

	private String id;

    private String name;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}