package com.bkgc.bean.account;

import com.bkgc.bean.PageParam;
import lombok.Data;

/**
 * Created by yanqiang on 2017/11/20.
 */
@Data
public class BkgcAccountSearchBean extends PageParam {
    private String operator;

    private String rechargeType;

    private String startDate;

    private String endDate;

    private String withdrawType;
}
