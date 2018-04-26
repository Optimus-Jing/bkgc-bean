package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class LottoJkpAwardAsktLog extends PageParam {
    private static final long serialVersionUID = 3677983143192392825L;

    private String id;

    private String userid;

    private String ticketid;

    private String lottosn;

    private Date requesttime;
}