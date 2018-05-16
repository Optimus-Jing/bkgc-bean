package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class LottoJkpAwardCheckLog extends PageParam {
    private static final long serialVersionUID = 4624149795587456490L;

    private String id;

    private String ticketid;

    private Integer awardlevel;

    private Integer checkmoney;

    private String checkerid;

    private String checkerip;

    private Date checktime;

    private String validcode;

    private String remark;

}