package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class LottoJkpAwardTicket extends PageParam {
    private static final long serialVersionUID = -4480817841611873245L;

    private String id;

    private String lottosn;

    private String imgpath;

    private String tickettype;

    private String barcode;

    private String ticketNumber;

    private String awardCode;

}