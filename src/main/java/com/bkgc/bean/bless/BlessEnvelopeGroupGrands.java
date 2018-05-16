package com.bkgc.bean.bless;


import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BlessEnvelopeGroupGrands extends PageParam {

    private static final long serialVersionUID = 1L;

    private String id;
    private String groupid;
    private Integer count;
    private BigDecimal univalence;

    /**
     * 原始数量
     */
    private Integer originalCount;

    /**
     * 原始金额
     */
    private BigDecimal originalAmount;

    /**
     * 创建时间
     */
    private Date createTime;
}
