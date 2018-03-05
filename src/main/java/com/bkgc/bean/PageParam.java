package com.bkgc.bean;

import java.io.Serializable;
import java.util.List;

public class PageParam implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5824110939654622766L;
	private Integer pageNum ; //页码
    private Integer pageSize ; //每一页大小
    private Integer pageStart;//开始页数
    private String searchParam;//通用搜索字段
    private Integer recordCount; //总条数
    private Integer searchChannelId;//搜索的渠道Id
    
    
    
    public Integer getSearchChannelId() {
		return searchChannelId;
	}

	public void setSearchChannelId(Integer searchChannelId) {
		this.searchChannelId = searchChannelId;
	}

	private List<?> data; //当前页的数据
    
    public PageParam(Integer pageStart,Integer pageSize) {
    	this.pageStart = pageStart;
    	this.pageSize = pageSize;
	}
    
    public PageParam() {
	}
    
    public String getSearchParam() {
		return searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPageNum() {
       return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
}
