package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserInfoReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:01
 */
@Data
public class UserInfoReturn {

    //注册手机号
    private String phone;

    //角色集合
    private String roles;

    //字符串
    private String guid;

    //用户名
    private String username;
}
