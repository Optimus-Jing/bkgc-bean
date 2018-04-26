package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class UserSearchVO extends PageParam {

    private String userName;

    private String loginId;

    private String phone;

}
