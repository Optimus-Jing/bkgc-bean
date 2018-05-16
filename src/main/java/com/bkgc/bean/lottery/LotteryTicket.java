package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LotteryTicket extends PageParam {
    private static final long serialVersionUID = 1815971129888921021L;

    private String id;

    private String name;

    private BigDecimal amount;

    private String imagepath;

    private Integer sortflag;

    private Integer status;

    private String remark;
}