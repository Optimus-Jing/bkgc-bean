package com.bkgc.bean.lottery;

import lombok.Data;

import java.util.Date;

@Data
public class LottoJkpAwardRule {
    private String id;

    private Integer type;

    private String checkerid;

    private String tickettype;

    private Date starttime;

    private Date endtime;

    private String checktimes;

}