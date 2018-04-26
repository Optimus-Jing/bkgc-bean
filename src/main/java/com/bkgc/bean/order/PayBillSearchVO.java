package com.bkgc.bean.order;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class PayBillSearchVO extends PageParam {

    private static final long serialVersionUID = 1L;

    private String type;

    private String machineId;

    private String orderNo;

    private String payType;

    private String tradeStatus;

    private String macId;

    private Date orderInStart;

    private Date orderOutEnd;

}
