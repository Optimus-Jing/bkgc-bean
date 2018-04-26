package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserRegReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午2:56
 */
@Data
public class UserRegReturn {

    //角色id
    private String roleId;

    //角色名称
    private String rolename;

    //平台
    private String platform;

    //用户名
    private String username;

    //唯一标识符
    private String guid;

    //手机号
    private String phone;

    //电子邮箱
    private String email;

}
