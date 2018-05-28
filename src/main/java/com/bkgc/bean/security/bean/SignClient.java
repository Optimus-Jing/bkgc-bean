package com.bkgc.bean.security.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SignClient implements Serializable {

    private static final long serialVersionUID = 3543102530793254372L;

    private String clientId;
    private String clientSecret;
}
