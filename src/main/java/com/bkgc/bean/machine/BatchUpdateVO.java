package com.bkgc.bean.machine;

import lombok.Data;

import java.util.ArrayList;
@Data
public class BatchUpdateVO {
	
	 private Integer cleanTradeTime;
	 
	 private Integer cleanLogTime;
	 
	 public ArrayList<Integer> ids = new ArrayList<Integer>();
}
