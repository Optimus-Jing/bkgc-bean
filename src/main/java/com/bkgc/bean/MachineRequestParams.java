package com.bkgc.bean;

import java.io.Serializable;
import java.util.List;

public class MachineRequestParams implements Serializable{

	private static final long serialVersionUID = 71578004625259308L;
	
	private String channelIds;
	
	private String channelId;
	
	private List<Integer> idList;
	
	private String machineIds;

	public String getChannelIds() {
		return channelIds;
	}

	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public String getMachineIds() {
		return machineIds;
	}

	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
	}



}
