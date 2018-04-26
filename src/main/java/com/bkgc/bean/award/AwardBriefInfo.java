package com.bkgc.bean.award;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AwardBriefInfo implements Serializable {

    private String userId;
    private BigDecimal amount;

    public AwardBriefInfo() {
        super();
    }
}
