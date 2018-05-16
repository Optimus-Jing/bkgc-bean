package com.bkgc.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ChannelOrder implements Serializable {

    private static final long serialVersionUID = -1104454491973197637L;
    private Integer UserId;
    private Integer pageIndex;
    private Integer pageSize;
    private Date startTime;
    private Date endTime;
    private Integer terminal;
    private Integer channelOrder;
    private Integer moneyOrder;
    private Integer terminalOrder;
    private String channel;
    private Integer channelId;
    private Integer searchChannelId;
    private String tradeType;
    private String deliveryType;
    private Integer arrayId;

}
