package com.bkgc.bean.bless;

public class BlessEnvelopeGroupMachineR {

	private Integer id;
	private String blessEnvelopeGroupId;
	private Integer machineId;
	private Integer status;
	
	public BlessEnvelopeGroupMachineR() {
		super();
	}
	
	public BlessEnvelopeGroupMachineR(String blessEnvelopeGroupId,Integer machineId) {
		this();
		this.blessEnvelopeGroupId = blessEnvelopeGroupId;
		this.machineId = machineId;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBlessEnvelopeGroupId() {
		return blessEnvelopeGroupId;
	}
	public void setBlessEnvelopeGroupId(String blessEnvelopeGroupId) {
		this.blessEnvelopeGroupId = blessEnvelopeGroupId;
	}

	public Integer getMachineId() {
		return machineId;
	}

	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}
	
}
