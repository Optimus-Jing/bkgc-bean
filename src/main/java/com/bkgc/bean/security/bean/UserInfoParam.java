package com.bkgc.bean.security.bean;


import lombok.Data;

/**
 * <p>Title:      UserInfoParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:00
 */
@Data
public class UserInfoParam {

    //唯一标识符
    private String guid;

    //token
    private String access_token;

    //手机号
    private String phone;

    private String roleid;
}
