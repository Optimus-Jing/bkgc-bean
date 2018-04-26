package com.bkgc.bean.order;

import com.bkgc.bean.CommonParams;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class OrderSearchVO extends CommonParams {
    private static final long serialVersionUID = 1839354110214873087L;

    private String orderNo;

    private String tradeStatus;

    private Integer channelId;

    private Date startDay;

    private Date endDay;

    private String payType;

    private String address;

    private String outProduct;

    private String machineId;

    private Integer paramChannel;

    private Integer addAudit;

    private Integer machineProductId;

    private String endDateStr;

    private String startDateStr;

    private Integer userId;

    private String productName;

    private String guid;

    private List<Integer> machineIds;

    private Integer pageNum; //页码
    private Integer pageSize; //每一页大小
    private Integer pageStart;//开始页数
    private String searchParam;//通用搜索字段
    private Integer recordCount; //总条数
    private Integer searchChannelId;//搜索的渠道Id
}
