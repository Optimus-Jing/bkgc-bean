package com.bkgc.bean.bless;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BlessGroupParam {
	
	private Integer aliveCount;//未领取福包数量
	private Integer receiveCount;//已领取福包数量
	private BigDecimal remainBalance;//福包剩余金额

}
