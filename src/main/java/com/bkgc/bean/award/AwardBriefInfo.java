package com.bkgc.bean.award;

import java.io.Serializable;
import java.math.BigDecimal;

public class AwardBriefInfo implements Serializable {

    private String userId;
    private BigDecimal amount;

    public AwardBriefInfo(){
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
