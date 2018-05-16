package com.bkgc.bean.bless;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BlessReciver {

    private String nickName; //昵称
    private String phone; //电话
    private BigDecimal awardAmount; //中奖金额
}
