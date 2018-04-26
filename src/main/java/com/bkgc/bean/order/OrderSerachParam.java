package com.bkgc.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class OrderSerachParam implements Serializable {

    private static final long serialVersionUID = 1L;


    public OrderSerachParam() {

    }

    private String startDateStr;//报表统计起始时间
    private String endDateStr;//报表统计结束时间
    private Integer channelId;//渠道Id
    private String userName;
    private Integer userId;
    private Integer machineId;//自助机编码
    private double orderPrice;//订单价格

    private String ticketId;

    private String payment;//订单支付方式

    private String shipStatus;//出货状态

    private Date startDate;
    private Date endDate;

    private String fromUserId;

    private List<Integer> idList;

    private List<String> groupIds;

    private Integer pageNum; //页码
    private Integer pageSize; //每一页大小
    private Integer pageStart;//开始页数
    private String searchParam;//通用搜索字段
    private Integer recordCount; //总条数
    private Integer searchChannelId;//搜索的渠道Id
}
