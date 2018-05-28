package com.bkgc.bean.security.bean;

import lombok.Data;

/**
 * <p>Title:      UserUpdateParam </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:14
 */
@Data
public class UserUpdateParam {

    //token
    private String access_token;

    //用户名
    private String username;

    //密码
    private String password;

    //手机号
    private String phone;

    //电子邮箱
    private String email;

    //唯一字符串
    private String guid;

    //头像路径
    private String img_url;

    //模块名
    private String module;

    //角色权限
    private String roleId;
}
