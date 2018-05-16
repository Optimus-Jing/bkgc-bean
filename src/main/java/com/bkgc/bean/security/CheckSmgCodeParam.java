package com.bkgc.bean.security;


import lombok.Data;

@Data
public class CheckSmgCodeParam {

    //手机号码
    private String phone;

    //验证码
    private String code;

}
