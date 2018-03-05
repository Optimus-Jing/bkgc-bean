package com.bkgc.bean.bless;


import com.bkgc.bean.PageParam;

public class BlessEnvelopeVaild  extends PageParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String startTime;
	private String endTime;
    private String groupid;
    private Integer type;
    
    
    
	public BlessEnvelopeVaild() {
	
	}

	public BlessEnvelopeVaild(Integer pageStart, Integer pageSize, String id, String startTime, String endTime,
			String groupid, Integer type) {
		super(pageStart, pageSize);
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.groupid = groupid;
		this.type = type;
	}

	public String getStartTime() {
		return startTime;

	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {

		return endTime;
	}

	public void setEndTime(String endTime) {

		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BlessEnvelopeVaild [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", groupid="
				+ groupid + ", type=" + type + "]";
	}
  
	

    
}
