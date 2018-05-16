package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserTokenParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午3:53
 */
@Data
public class UserTokenParam {

    //用户名(必填)
    private String username;

    //密码(必填)
    private String password;

    //模块(必填)
    private String module;

    //应用id(必填)
    private String client_id;

    //应用秘钥(必填)
    private String client_secret;

    //模式(必填)
    private String grant_type;

    //权限范围(必填)
    private String scope;

    //登录方式
    private String login_type;
}
