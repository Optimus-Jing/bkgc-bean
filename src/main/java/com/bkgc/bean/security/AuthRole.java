package com.bkgc.bean.security;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class AuthRole extends PageParam {
    private static final long serialVersionUID = -1542931209146162098L;

    private String id;

    private String name;

    private Integer status;
}