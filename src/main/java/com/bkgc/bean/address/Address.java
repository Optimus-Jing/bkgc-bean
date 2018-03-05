package com.bkgc.bean.address;

import java.util.Date;

import lombok.Data;

@Data
public class Address {
	
	
	private String id;//编号
	private String mchId;//商户Id
	private String receivePersion;//收货人
	private String phone;//联系方式
	private String cityCode;//省市区编码
	private String detailAddress;//详细地址
	private Date createTime;//创建时间
	private Date updateTime;//更新时间

}
