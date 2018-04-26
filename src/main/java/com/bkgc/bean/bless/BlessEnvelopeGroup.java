package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
public class BlessEnvelopeGroup extends PageParam {
    private static final long serialVersionUID = 217848810212805403L;

    private String id;

    private String name;

    private Date createtime;//创建时间

    private String fromuserid;//发福包人

    private Integer fromusertype;

    private Date expiredtime;//超时时间

    private Integer issinglecode;

    private String remark;//备注

    private Integer ispay;//是否支付：1 支付 0 未支付

    private Integer isbackpay;

    private Integer sendtype;

    private BigDecimal amount;//福包总金额

    private Integer number;//福包总量

    private Integer isapplybackpay;

    private String traceno;

    private String inway;

    private Integer aliveCount;//可用福包数量

    private BigDecimal balance;//剩余福包总金额

    private Integer grands;//1：正常发福包  2 按照等级发福包

    private String blessDescribe;//福包类型

    private String startTime;//开始时间
    private Integer machineId;//自助机编码

    private String adURL;//广告地址

    private Date endTime;

    private List<String> idList;

    private String phone;

    private String userName;

    private String isAd;

    private String type;

    private BigDecimal randMax;

    private BigDecimal randMin;

    private Date updateTime;


    public BlessEnvelopeGroup() {
        // TODO Auto-generated constructor stub
    }

    public BlessEnvelopeGroup(String fromuserid, Integer fromusertype, Integer ispay, Integer isbackpay, Integer sendtype) {
        this.fromuserid = fromuserid;
        this.fromusertype = fromusertype;
        this.ispay = ispay;
        this.isbackpay = isbackpay;
        this.sendtype = sendtype;
    }
}