package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;

public class BlessEnvelopeRMachine extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7515949661061809578L;

	private Integer id;

    private String blessenvelopegroupId;

    private Integer machineId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlessenvelopegroupId() {
        return blessenvelopegroupId;
    }

    public void setBlessenvelopegroupId(String blessenvelopegroupId) {
        this.blessenvelopegroupId = blessenvelopegroupId == null ? null : blessenvelopegroupId.trim();
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}