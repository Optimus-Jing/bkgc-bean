package com.bkgc.bean.location;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanqiang
 */
@Data
public class Coordinate implements Serializable {

    private static final long serialVersionUID = 839798945012599131L;

    /**
     * 纬度
     */
    private double latitude;

    /**
     * 经度
     */
    private double longitude;

}
