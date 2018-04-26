package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserTokenReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午3:57
 */
@Data
public class UserTokenReturn {

    //token
    private String access_token;

    //token类型
    private String token_type;

    //刷新token
    private String refresh_token;

    //过期时间(秒)
    private String expires_in;

    //范围
    private String scope;
}
