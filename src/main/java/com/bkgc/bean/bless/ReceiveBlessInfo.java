package com.bkgc.bean.bless;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ReceiveBlessInfo {
	
	private String Id;
	private String name;
	private String phone;
	private BigDecimal amount;
	private Date createtime;

}
