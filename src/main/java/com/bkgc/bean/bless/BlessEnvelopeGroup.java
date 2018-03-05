package com.bkgc.bean.bless;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.bkgc.bean.PageParam;

import lombok.Data;


@Data
public class BlessEnvelopeGroup extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = 217848810212805403L;

	private String id;

    private String name;

    private Date createtime;//创建时间

    private String fromuserid;//发福包人

    private Integer fromusertype;

    private Date expiredtime;//超时时间

    private Integer issinglecode;

    private String remark;//备注

    private Integer ispay;//是否支付：1 支付 0 未支付

    private Integer isbackpay;

    private Integer sendtype;

    private BigDecimal amount;//福包总金额

    private Integer number;//福包总量

    private Integer isapplybackpay;

    private String traceno;

    private String inway;
    
    private Integer aliveCount;//可用福包数量
    
    private BigDecimal balance;//剩余福包总金额
    
    private Integer grands;//1：正常发福包  2 按照等级发福包
    
    private String blessDescribe;//福包类型
    
    private String startTime;//开始时间
    private Integer machineId;//自助机编码
    
    private String adURL;//广告地址
    
    private Date endTime;
    
	private List<String> idList;
	
	private String phone;
	
	
	private String userName;
	
	private String isAd;
	
	private String type;

    private BigDecimal randMax;

    private BigDecimal randMin;

    private Date updateTime;

    public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public BlessEnvelopeGroup() {
		// TODO Auto-generated constructor stub
	}
    
    public BlessEnvelopeGroup(String fromuserid, Integer fromusertype,Integer ispay,Integer isbackpay,Integer sendtype) {
    	this.fromuserid = fromuserid;
    	this.fromusertype= fromusertype;
    	this.ispay=ispay;
    	this.isbackpay=isbackpay;
    	this.sendtype=sendtype;
	}  
      
	public String getAdURL() {
		return adURL;
	}

	public void setAdURL(String adURL) {
		this.adURL = adURL;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getMachineId() {
		return machineId;
	}

	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}

	public Integer getGrands() {
		return grands;
	}

	public void setGrands(Integer grands) {
		this.grands = grands;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Integer getAliveCount() {
		return aliveCount;
	}

	public void setAliveCount(Integer aliveCount) {
		this.aliveCount = aliveCount;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid == null ? null : fromuserid.trim();
    }

    public Integer getFromusertype() {
        return fromusertype;
    }

    public void setFromusertype(Integer fromusertype) {
        this.fromusertype = fromusertype;
    }

    public Date getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(Date expiredtime) {
        this.expiredtime = expiredtime;
    }

    public Integer getIssinglecode() {
        return issinglecode;
    }

    public void setIssinglecode(Integer issinglecode) {
        this.issinglecode = issinglecode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIspay() {
        return ispay;
    }

    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    public Integer getIsbackpay() {
        return isbackpay;
    }

    public void setIsbackpay(Integer isbackpay) {
        this.isbackpay = isbackpay;
    }

    public Integer getSendtype() {
        return sendtype;
    }

    public void setSendtype(Integer sendtype) {
        this.sendtype = sendtype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIsapplybackpay() {
        return isapplybackpay;
    }

    public void setIsapplybackpay(Integer isapplybackpay) {
        this.isapplybackpay = isapplybackpay;
    }

    public String getTraceno() {
        return traceno;
    }

    public void setTraceno(String traceno) {
        this.traceno = traceno == null ? null : traceno.trim();
    }

    public String getInway() {
        return inway;
    }

    public void setInway(String inway) {
        this.inway = inway == null ? null : inway.trim();
    }







}