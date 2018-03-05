package com.bkgc.bean.user;

import java.util.Date;

import com.bkgc.bean.PageParam;

public class AuthFriend extends PageParam {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4339867472442014745L;

	private String id;

    private String memberid;

    private String friendmemberid;

    private Date createtime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    public String getFriendmemberid() {
        return friendmemberid;
    }

    public void setFriendmemberid(String friendmemberid) {
        this.friendmemberid = friendmemberid == null ? null : friendmemberid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}