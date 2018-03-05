package com.bkgc.bean.machine;

import java.util.ArrayList;

public class BatchUpdateVO {
	
	 private Integer cleanTradeTime;
	 
	 private Integer cleanLogTime;
	 
	 public ArrayList<Integer> ids = new ArrayList<Integer>();

	public Integer getCleanTradeTime() {
		return cleanTradeTime;
	}

	public void setCleanTradeTime(Integer cleanTradeTime) {
		this.cleanTradeTime = cleanTradeTime;
	}

	public Integer getCleanLogTime() {
		return cleanLogTime;
	}

	public void setCleanLogTime(Integer cleanLogTime) {
		this.cleanLogTime = cleanLogTime;
	}

	public ArrayList<Integer> getIds() {
		return ids;
	}

	public void setIds(ArrayList<Integer> ids) {
		this.ids = ids;
	}
	 
     
}
