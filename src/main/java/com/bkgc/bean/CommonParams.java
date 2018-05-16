package com.bkgc.bean;

import lombok.Data;

@Data
public class CommonParams {

    private String clientID;

    private String nonce_str;

    private String sign;

    private String traceId;

}
