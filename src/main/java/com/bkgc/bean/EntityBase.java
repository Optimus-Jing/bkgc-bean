package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class EntityBase extends PageParam implements Serializable {

    private static final long serialVersionUID = -5547513403772518117L;

    private String id;
}

