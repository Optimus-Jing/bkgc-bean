package com.bkgc.bean.location;

import java.io.Serializable;

/**
 * 
 * @author yanqiang
 *
 */
public class Coordinate implements Serializable{
	
	private static final long serialVersionUID = 839798945012599131L;

	/**
	 * 纬度
	 */
	private double latitude;
	
	/**
	 * 经度
	 */
	private double longitude;
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
