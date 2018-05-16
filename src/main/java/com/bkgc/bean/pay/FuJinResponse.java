package com.bkgc.bean.pay;

import lombok.Data;

@Data
public class FuJinResponse {

    private String msg;

    private String partner;

    private String partnername;

    private String payorderid;

    private String fee;

    private String orderNo;

    private String qr_code;

}
