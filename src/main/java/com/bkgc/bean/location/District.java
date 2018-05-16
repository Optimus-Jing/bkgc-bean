package com.bkgc.bean.location;

import lombok.Data;

import java.io.Serializable;

@Data
public class District implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer pid;
}
