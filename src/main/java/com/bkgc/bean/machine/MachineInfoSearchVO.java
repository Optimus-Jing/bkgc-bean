package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;

public class MachineInfoSearchVO extends PageParam{
	  
        
	     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Integer runStatus;
	     private String version;
	     private Integer sceneId;
	     private String machineName;
	     private String machineVersion;
	     private Integer belongStore;
	     private String address;
	     private Integer machineId;
	     private Integer channelId;
	     private Integer terminal;
	     public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Integer getChannelId() {
			return channelId;
		 }
		 public void setChannelId(Integer channelId) {
			this.channelId = channelId;
		 }
		 public Integer getTerminal() {
			return terminal;
		 }
	     public void setTerminal(Integer terminal) {
	 		this.terminal = terminal;
		 }
		 public Integer getMachineId() {
				return machineId;
		 }
		 public void setMachineId(Integer machineId) {
				this.machineId = machineId;
		 }
		 public Integer getRunStatus() {
				return runStatus;
		 }
		 public void setRunStatus(Integer runStatus) {
				this.runStatus = runStatus;
		 }
		 public String getVersion() {
				return version;
		
		 }
		 public void setVersion(String version) {
				this.version = version;
		 }
		 public Integer getSceneId() {
				return sceneId;
		 }
		 public void setSceneId(Integer sceneId) {
				this.sceneId = sceneId;
		 }
		 public String getMachineName() {
				return machineName;
		 }
		 public void setMachineName(String machineName) {
				this.machineName = machineName;
		
		 }
		 public String getMachineVersion() {
				return machineVersion;
		 }
		 public void setMachineVersion(String machineVersion) {
				this.machineVersion = machineVersion;
		 }
		 public Integer getBelongStore() {
				return belongStore;
		 }
		 public void setBelongStore(Integer belongStore) {
				this.belongStore = belongStore;
		 }
		 public String getAddress() {
				return address;
		 }
		 public void setAddress(String address) {
				this.address = address;
		 }
	     
	     
}
