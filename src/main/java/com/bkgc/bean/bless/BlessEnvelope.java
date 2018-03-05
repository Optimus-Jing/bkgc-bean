package com.bkgc.bean.bless;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.bkgc.bean.PageParam;

import lombok.Data;

@Data
public class BlessEnvelope extends PageParam{
    /**
	 * 
	 */
	private static final long serialVersionUID = -9092189231010468401L;

	private String id;

    private Date createtime;

    private Integer type;

    private BigDecimal amount;

    private String lotterytickettypename;

    private String goodsid;

    private Date receiveexpiredtime;

    private String remark;

    private String fromuserid;

    private Integer fromusertype;

    private String receivememberid;

    private Date receivetime;

    private String receivelocation;

    private Integer isopened;

    private Date opentime;

    private String groupid;

    private String originalid;

    private String lastid;

    private Date posttime;

    private Integer isused;

    private Integer istransfer;
    
    private String thisday;
    
    private Date startTime;//开始时间
    
    private Date endTime;//结束时间
    
	private List<String> idList;
	
	private String name;
	
	private String phone;
    
	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public BlessEnvelope() {
		// TODO Auto-generated constructor stub
	}
    
    public BlessEnvelope(String receivememberid,Integer isopened, Integer istransfer,Integer isused,Integer type) {
    	this.receivememberid = receivememberid;
    	this.isopened = isopened;
    	this.istransfer=istransfer;
    	this.isused=isused;
    	this.type=type;
	}

    public BlessEnvelope(String receivememberid, Integer isopened) {
    	this.receivememberid = receivememberid;
    	this.isopened = isopened;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLotterytickettypename() {
        return lotterytickettypename;
    }

    public void setLotterytickettypename(String lotterytickettypename) {
        this.lotterytickettypename = lotterytickettypename == null ? null : lotterytickettypename.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public Date getReceiveexpiredtime() {
        return receiveexpiredtime;
    }

    public void setReceiveexpiredtime(Date receiveexpiredtime) {
        this.receiveexpiredtime = receiveexpiredtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getReceivememberid() {
        return receivememberid;
    }

    public void setReceivememberid(String receivememberid) {
        this.receivememberid = receivememberid == null ? null : receivememberid.trim();
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getReceivelocation() {
        return receivelocation;
    }

    public void setReceivelocation(String receivelocation) {
        this.receivelocation = receivelocation == null ? null : receivelocation.trim();
    }

    public Integer getIsopened() {
        return isopened;
    }

    public void setIsopened(Integer isopened) {
        this.isopened = isopened;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getOriginalid() {
        return originalid;
    }

    public void setOriginalid(String originalid) {
        this.originalid = originalid == null ? null : originalid.trim();
    }

    public String getLastid() {
        return lastid;
    }

    public void setLastid(String lastid) {
        this.lastid = lastid == null ? null : lastid.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
    }

    public Integer getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(Integer istransfer) {
        this.istransfer = istransfer;
    }

	public String getThisday() {
		return thisday;
	}

	public void setThisday(String thisday) {
		this.thisday = thisday;
	}
    
}