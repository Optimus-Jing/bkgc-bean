package com.bkgc.bean.user;

import java.util.Date;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class AuthFriend extends PageParam {

	private static final long serialVersionUID = 4339867472442014745L;

	private String id;

    private String memberid;

    private String friendmemberid;

    private Date createtime;

    private Integer status;

}