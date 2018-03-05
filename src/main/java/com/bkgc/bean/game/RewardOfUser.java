package com.bkgc.bean.game;

import java.util.Date;

public class RewardOfUser {
    private String id;

    private String rewardId;

    private String userId;

    private Date gainedTime;

    private Integer status;

    private Date expired;
    
    private Integer pagestart;
    
    private Integer pageLimit;
    
    private String rewardCode;
    
    private Integer flag;
    
    //快递单号
    private String mailNo;
    
    //快递公司
    private String courier;
       
    private String rewardName;
    
    private String rewardType;

	public String getRewardCode() {
		return rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public String getRewardType() {
		return rewardType;
	}

	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}

	public String getMailNo() {
		return mailNo;
	}

	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getPagestart() {
		return pagestart;
	}

	public void setPagestart(Integer pagestart) {
		this.pagestart = pagestart;
	}

	public Integer getPageLimit() {
		return pageLimit;
	}

	public void setPageLimit(Integer pageLimit) {
		this.pageLimit = pageLimit;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId == null ? null : rewardId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getGainedTime() {
        return gainedTime;
    }

    public void setGainedTime(Date gainedTime) {
        this.gainedTime = gainedTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public RewardOfUser() {
    }
}