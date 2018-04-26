package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserAccessTokenParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:03
 */
@Data
public class UserAccessTokenParam {

    //应用id
    private String client_id;

    //应用秘钥
    private String client_secret;

    //grant_type
    private String grant_type;

    //刷新token
    private String refresh_token;

}
