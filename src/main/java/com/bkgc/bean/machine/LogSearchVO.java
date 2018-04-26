package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class LogSearchVO extends PageParam {
    private static final long serialVersionUID = 6122733487235035799L;

    private Date signInStart;

    private Date signInEnd;

    private Date signOutStart;

    private Date signOutEnd;

    private String machineId;

    private Integer type;
}
