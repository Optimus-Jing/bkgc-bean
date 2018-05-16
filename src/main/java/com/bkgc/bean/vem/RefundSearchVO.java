package com.bkgc.bean.vem;


import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class RefundSearchVO extends PageParam {

    private String userName;

    private String orderNo;

    private Date startOrder;

    private Date endOrder;

}
