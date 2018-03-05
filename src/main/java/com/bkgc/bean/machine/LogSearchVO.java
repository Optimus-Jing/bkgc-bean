package com.bkgc.bean.machine;

import java.util.Date;

import com.bkgc.bean.PageParam;


public class LogSearchVO extends PageParam{
	//{"signInStart":signInStart,"signInEnd":signInEnd,"signOutStart":signOutStart,"signOutEnd":signOutEnd,"machineId":machineId}
	private static final long serialVersionUID = 6122733487235035799L;

	private Date signInStart;
	
	private Date signInEnd;
	
	private Date signOutStart;
	
	private Date signOutEnd;
	
	private String machineId;
   
	private Integer type;
	
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getSignInStart() {
		return signInStart;
	}

	public void setSignInStart(Date signInStart) {
		this.signInStart = signInStart;
	}

	public Date getSignInEnd() {
		return signInEnd;
	}

	public void setSignInEnd(Date signInEnd) {
		this.signInEnd = signInEnd;
	}

	public Date getSignOutStart() {
		return signOutStart;
	}

	public void setSignOutStart(Date signOutStart) {
		this.signOutStart = signOutStart;
	}

	public Date getSignOutEnd() {
		return signOutEnd;
	}

	public void setSignOutEnd(Date signOutEnd) {
		this.signOutEnd = signOutEnd;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	
}
