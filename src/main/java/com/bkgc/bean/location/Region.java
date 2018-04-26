package com.bkgc.bean.location;

import lombok.Data;

import java.io.Serializable;

@Data
public class Region implements Serializable {

    private static final long serialVersionUID = 13812308608563611L;
    private Integer code;
    private String name;
}
