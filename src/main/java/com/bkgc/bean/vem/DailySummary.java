package com.bkgc.bean.vem;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DailySummary {

    private String id;
    private Date Data_of_date;
    private Integer sceneId;
    private String sceneName;
    private Integer productId;
    private String productName;
    private BigDecimal salesAmount;
    private Date genTime;
    private BigDecimal totalAmount;
    private Integer totalCount;

}
