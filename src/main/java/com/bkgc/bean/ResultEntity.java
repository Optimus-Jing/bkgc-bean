package com.bkgc.bean;

import java.io.Serializable;

public class ResultEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;

	private String error;

	private Object data;
   
	private Integer count;
	
	public ResultEntity() {
		super();
	}
	
	public ResultEntity(Integer code) {
		this();
		this.code=code;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
