package com.bkgc.bean.settle;

import lombok.Data;

/**
 * Created by yanqiang on 2017/11/16.
 */
@Data
public class SettleSearchBean {

    private String settleNo;

    private String startDate;

    private String endDate;

    private String deviceId;

    private Integer pageStart;

    private Integer pageSize;

    private String operator;

    private String deviceSettleId;

    private Integer settleState;

}
