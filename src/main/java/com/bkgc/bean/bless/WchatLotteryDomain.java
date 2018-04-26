package com.bkgc.bean.bless;

import lombok.Data;

import java.io.Serializable;

@Data
public class WchatLotteryDomain implements Serializable {
    private static final long serialVersionUID = -1595371216905016135L;

    private Integer id;

    //中奖金额
    private String prize;

    //中奖率
    private Integer v;

    public WchatLotteryDomain(Integer id, String prize, Integer v) {
        this.id = id;
        this.prize = prize;
        this.v = v;
    }

}
