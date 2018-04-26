package com.bkgc.bean.bless;

import lombok.Data;

@Data
public class ReceivedBlessEnvelope extends BlessEnvelope {

    private static final long serialVersionUID = -6913883722766823632L;
    private String fromuserphoto;

    private String fromName;
}
