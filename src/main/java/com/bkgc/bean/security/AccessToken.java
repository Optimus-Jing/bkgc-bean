package com.bkgc.bean.security;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class AccessToken implements Serializable {

    /**
     * 增加token Bean
     */
    private static final long serialVersionUID = 4869968349568479984L;

    private String refreshToken;
    private Timestamp expireTime;
    private byte[] accessToken;

}
