package com.bkgc.bean.channel;

import java.io.Serializable;
import java.util.Date;

import com.bkgc.bean.PageParam;

import lombok.Data;


@Data
public class Channel extends PageParam implements Serializable{
	private static final long serialVersionUID = 6197925949941866035L;

    private Integer id;

    private String name;//渠道名称

    private String description;//描述

    private String channelCode;//渠道编码

    private Integer grade;//渠道级别

    private Integer parentId;//父级编码

    private String path;//父节点路径

    private Integer channelType;//渠道类型

    private String type;//业务类型

    private String address;//地址

    private String postcode;//邮编

    private String contact;//联系人

    private String contactPhone;//联系电话

    private String longitude;//经度

    private String latitude;//纬度

    private String imgUrl;//店铺图片

    private String regionCode;//所属区县编码

    private String areaName;//区域名称

    private Date createTime;//创建时间

    private Date updateTime;//更新时间

    private Integer status;//渠道状态
    
    private Date createTimeStart;
    
    private Date createTimeEnd;

    private Integer searchChannelId;
    
    private String parentName;
    
    private String guid;
    


	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
    
    
}