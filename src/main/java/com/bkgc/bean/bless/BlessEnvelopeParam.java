package com.bkgc.bean.bless;

import java.io.Serializable;

/**
 * <p>Title:      BlessEnvelopeParam. </p>
 * <p>Description  福金福包转账接口参数</p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         <a href="zftbank@qq.com"/>张付涛</a>
 * @CreateDate     2017/5/27 14:28
 */
//@Data
public class BlessEnvelopeParam implements Serializable{

    private static final long serialVersionUID = -7615582399365989403L;

    private String fromUserId;

    private String toUserId;

    private String money;

    private String remark;

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "{fromUserId=" + fromUserId + ", toUserId=" + toUserId + ", money=" + money
				+ ", remark=" + remark + "}";
	}
    
    

}
