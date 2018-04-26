package com.bkgc.bean.bless;

import lombok.Data;

@Data
public class BlessEnvelopeGroupMachineR {

    private Integer id;
    private String blessEnvelopeGroupId;
    private Integer machineId;
    private Integer status;

    public BlessEnvelopeGroupMachineR() {
        super();
    }

    public BlessEnvelopeGroupMachineR(String blessEnvelopeGroupId, Integer machineId) {
        this();
        this.blessEnvelopeGroupId = blessEnvelopeGroupId;
        this.machineId = machineId;
    }
}
