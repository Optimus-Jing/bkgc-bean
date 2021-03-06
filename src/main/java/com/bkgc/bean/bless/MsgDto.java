package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class MsgDto {

    private int msgId;

    /**
     * 消息类型
     */
    private String msgType;

    /**
     * 停留时长
     */
    private Integer remainTimes;

    /**
     * 是否重复展示
     */
    private Integer repeatShow;

    /**
     * 展示优先级
     */
    private Integer showPriority;

    /**
     * 是否可点击进入
     */
    private Integer clickIn;

    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 点击进入地址
     */
    private String url;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String alias;

    /**
     * 是否已读:1.未读,2.已读
     */
    private Integer isRead;

    /**
     * 是否删除:0.否,1.是
     */
    private Integer isFlag;

    /**
     * 1个人消息；2公共消息（群发）
     */
    private Integer type;

    /**
     * 消息头
     */
    private String title;

    /**
     * 对应msgtype的描述
     */
    private String msgTypeDesc;


    public MsgDto() {
    }
}
