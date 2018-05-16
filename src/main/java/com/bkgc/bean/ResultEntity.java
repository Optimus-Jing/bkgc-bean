package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String error;

    private Object data;

    private Integer count;

    public ResultEntity() {
        super();
    }

    public ResultEntity(Integer code) {
        this();
        this.code = code;
    }
}
