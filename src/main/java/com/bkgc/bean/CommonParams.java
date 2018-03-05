package com.bkgc.bean;

import lombok.Data;

@Data
public class CommonParams {

    private String clientID;

    private String nonce_str;

    private String sign;

    private String traceId;


    @Override
    public String toString() {
        return "CommonParams{" +
                "clientID='" + clientID + '\'' +
                ", nonce_str='" + nonce_str + '\'' +
                ", sign='" + sign + '\'' +
                ", traceId='" + traceId + '\'' +
                '}';
    }
}
