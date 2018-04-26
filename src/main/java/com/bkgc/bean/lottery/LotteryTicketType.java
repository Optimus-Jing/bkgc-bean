package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LotteryTicketType extends PageParam {
    private static final long serialVersionUID = -1965545038754273669L;

    private String id;

    private String name;

    private BigDecimal amount;

}