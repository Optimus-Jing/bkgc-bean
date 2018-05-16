package com.bkgc.bean.lottery;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class JkpAwardTicket extends PageParam {
    private static final long serialVersionUID = 4280232057817845940L;

    private String id;

    private String lottosn;

    private String imgpath;

    private String tickettype;

    private String barcode;
}