package com.bkgc.bean.security;


import lombok.Data;

/**
 * <p>Title:      UserRegParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午2:52
 */
@Data
public class UserRegParam {

    //平台(必填)
    private String platform;

    //手机号(必填)
    private String phone;

    //密码(必填)
    private String password;

    //角色id(必填)
    private String roleid;

    //用户名称
    private String username;

    //电子邮箱
    private String email;

    //第三方的openId
    private String openid;

    //第三方昵称
    private String nickname;

    //iconurl
    private String iconUrl;

    //第三方备用信息
    private String backup;

    //手机验证码
    private String code;
}
