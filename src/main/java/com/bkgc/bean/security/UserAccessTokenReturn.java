package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserAccessTokenReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:05
 */
@Data
public class UserAccessTokenReturn {

    //token
    private String access_token;

    //token类型
    private String token_type;

    //refresh_token
    private String refresh_token;

    //过期时间
    private String expires_in;

    //权限范围
    private String scope;

}
