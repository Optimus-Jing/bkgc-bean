package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 盘点商品bean
 *
 * @author yanqiang
 */
@Data
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1350595608550660488L;

    public Inventory() {
        this.putOnNum = 0;
        this.putOffNum = 0;
        this.soldNum = 0;
        this.remainNum = 0;
        this.startNum = 0;
    }

    private Integer userId;
    /**
     * 商品Id
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 上货数量
     */
    private Integer putOnNum;

    /**
     * 售出数量
     */
    private Integer soldNum;


    /**
     * 剩余数量
     */
    private Integer remainNum;

    private Integer putOffNum;

    private Date createTimeStart;

    private Date createTimeEnd;

    private Integer channelId;

    private Integer machineId;

    private Integer startNum;

    private String createTimeStartStr;

    private String createTimeEndStr;

    public void dateformat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        if (createTimeStart != null) {
            this.setCreateTimeStartStr(sdf.format(createTimeStart));
        }
        if (createTimeEnd != null) {
            this.setCreateTimeEndStr(sdf.format(createTimeEnd));
        }
    }
}
