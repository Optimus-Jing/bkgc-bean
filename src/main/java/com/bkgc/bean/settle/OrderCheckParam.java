package com.bkgc.bean.settle;

import lombok.Data;

/**
 * Created by yanqiang on 2017/11/17.
 */
@Data
public class OrderCheckParam {

    private String id;

    private String amount;

    private String operator;

    private String annotation;

    private String deviceSettleId;

}
