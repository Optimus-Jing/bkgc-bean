package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LotteryTicketOrder extends PageParam {
    private static final long serialVersionUID = -4488809840195781063L;

    private String id;

    private Date createtime;

    private String createuserid;

    private BigDecimal amount;

    private Integer number;

    private String remark;

    private Integer poststatus;

    private Integer paystatus;

    private String postsn;

    private String paytraceno;

    private String payway;

    private String name;

    private String gender;

    private String phone;

    private String province;

    private String city;

    private String address;

    private String housenumber;

    private String postcode;
}