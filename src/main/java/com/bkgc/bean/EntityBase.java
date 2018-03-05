package com.bkgc.bean;
public class EntityBase extends PageParam implements java.io.Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5547513403772518117L;
	private String id;
    /**
    * 编号
    */
	public String getId() {
	    return this.id;
    }
    /**
    * 编号
    */
	public void setId(String id) {
		this.id = id;
	}
    
}

