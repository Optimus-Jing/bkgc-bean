package com.bkgc.bean.security;

import lombok.Data;

/**
 * <p>Title:      UserTokenExpireReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午4:12
 */
@Data
public class UserTokenExpireReturn {

    //是否可用，true为可用
    private String available;
}
