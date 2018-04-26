package com.bkgc.bean.bless;

import lombok.Data;

@Data
public class WeightCategory {
    private String category;
    private Integer weight;


    public WeightCategory() {
        super();
    }

    public WeightCategory(String category, Integer weight) {
        super();
        this.setCategory(category);
        this.setWeight(weight);
    }
}
