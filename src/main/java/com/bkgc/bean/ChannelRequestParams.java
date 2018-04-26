package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ChannelRequestParams implements Serializable {

    private static final long serialVersionUID = -833792041474061212L;

    /**
     * 商家名称
     */
    private String channelName;

    private List<Integer> channelIds;

    /**
     * 场景ID
     */
    private Integer sceneId;

    /**
     * 经度
     */
    private double longitude;

    /**
     * 纬度
     */
    private double latitude;

    /**
     * 每页显示记录数
     */
    private Integer pageSize;

    /**
     * 当前页数
     */
    private Integer pageNum;

    private Integer pageStart;
}
