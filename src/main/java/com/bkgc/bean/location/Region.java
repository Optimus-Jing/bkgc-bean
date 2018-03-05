package com.bkgc.bean.location;

import java.io.Serializable;


public class Region implements Serializable {

	private static final long serialVersionUID = 13812308608563611L;
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
