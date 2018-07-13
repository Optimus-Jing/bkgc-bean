package com.bkgc.bean.game;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Reward {
    private String id;

    private String code;

    private String name;

    private Integer type;

    private String description;

    private Integer status;

    private Integer grade;

    private Integer expireDay;

    private BigDecimal price;

    private String guid;

    private Integer weight;
}