package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LotteryTicketOrderDetail extends PageParam {
    private static final long serialVersionUID = 4812934430190988014L;

    private String id;

    private String lotteryticketid;

    private Integer number;

    private String orderid;

    private String name;

    private BigDecimal amount;

    private String imagepath;
}