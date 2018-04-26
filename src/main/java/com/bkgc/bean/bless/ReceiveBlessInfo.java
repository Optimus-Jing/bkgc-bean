package com.bkgc.bean.bless;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ReceiveBlessInfo {

    private String Id;
    private String name;
    private String phone;
    private BigDecimal amount;
    private Date createtime;

}
