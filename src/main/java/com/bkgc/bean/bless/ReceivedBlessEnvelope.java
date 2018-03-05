package com.bkgc.bean.bless;

public class ReceivedBlessEnvelope extends BlessEnvelope {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6913883722766823632L;
	private String fromuserphoto;
	
	private String fromName;

	public String getFromuserphoto() {
		return fromuserphoto;
	}

	public void setFromuserphoto(String fromuserphoto) {
		this.fromuserphoto = fromuserphoto;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

}
