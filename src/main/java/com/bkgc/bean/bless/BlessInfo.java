package com.bkgc.bean.bless;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BlessInfo {

	private String id;//福包Id
	private Integer receiveCount;//已领取福包数量
	private BigDecimal receiveMoney;//已领取福包金额
	private Integer aliveCount;//福包剩余总个数
	private BigDecimal amount;//福包总金额
    private BigDecimal balance;//剩余福包总金额
    private String adURL;//福包广告地址

	private String expiredTime;
    
	
}
