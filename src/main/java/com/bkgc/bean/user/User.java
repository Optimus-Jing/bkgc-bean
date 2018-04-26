package com.bkgc.bean.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data
public class User  implements Serializable{

	private static final long serialVersionUID = -3240782195031627036L;

	private Integer id;
	
	private String userId;

    private String username;
    
    private String nickName;

    private String phone;

    private String loginId;

    private String password;

    private String sex;

    private String mail;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String idCard;

    private String address;

    private String wechatId;

    private Integer channelId;

    private Integer roleId;
    
    private Integer level;

    private String createTimeStr;

    private String sexStr;

}