package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class BlessEnvelopeRMachine extends PageParam {

    private static final long serialVersionUID = -7515949661061809578L;

    private Integer id;

    private String blessenvelopegroupId;

    private Integer machineId;

    private Integer status;

}