package com.bkgc.bean.pay;

import lombok.Data;

@Data
public class AlipayParams {

    private String out_trade_no;

    private String total_amount;

    private String subject;

    private String timeout_express;

    private String terminal_id;

    private String sys_service_provider_id;

    private String store_id;

}
