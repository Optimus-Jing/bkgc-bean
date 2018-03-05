package com.bkgc.bean.machine;

import java.util.Date;

import com.bkgc.bean.PageParam;
import com.bkgc.bean.channel.Channel;
import com.bkgc.bean.store.Store;

public class Aisle extends PageParam{
	private static final long serialVersionUID = 7433970494019438064L;

	private Integer id;

	private String name;

	private Integer capacity;

	private String aisleType;

	private Integer count;

	private Integer status;

	private Date createTime;

	private Date updateTime;

	private Integer isDelete;

	private Integer currentLayer;

	private Integer machineProductId;

	private Integer operate;

	private Integer userId;

	private Integer productId;

	private String productName;

	private Integer productStatus;

	private String categoryName;

	private String shortDescription;

	private String description;

	private String imgUrl;

	private String litimgUrl;

	private Integer price;

	private Integer salePrice;

	private Integer isSale;

	private Date saleStartTime;

	private Date saleEndTime;

	private String barcode;

	private Date expiryTime;

	private String supplyType;

	private Integer isRandom;

	private Integer machineId;

	private Integer maxBonus;
	
	private MachineInfo machine;
	
	private Scene scene;
	 
	private Channel channel;
	
	private Store store;
	
	private String channelName;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getAisleType() {
		return aisleType;
	}

	public void setAisleType(String aisleType) {
		this.aisleType = aisleType == null ? null : aisleType.trim();
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getCurrentLayer() {
		return currentLayer;
	}

	public void setCurrentLayer(Integer currentLayer) {
		this.currentLayer = currentLayer;
	}

	public Integer getMachineProductId() {
		return machineProductId;
	}

	public void setMachineProductId(Integer machineProductId) {
		this.machineProductId = machineProductId;
	}

	public Integer getOperate() {
		return operate;
	}

	public void setOperate(Integer operate) {
		this.operate = operate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName == null ? null : categoryName.trim();
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription == null ? null : shortDescription.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getLitimgUrl() {
		return litimgUrl;
	}

	public void setLitimgUrl(String litimgUrl) {
		this.litimgUrl = litimgUrl == null ? null : litimgUrl.trim();
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getIsSale() {
		return isSale;
	}

	public void setIsSale(Integer isSale) {
		this.isSale = isSale;
	}

	public Date getSaleStartTime() {
		return saleStartTime;
	}

	public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType == null ? null : supplyType.trim();
	}

	public Integer getIsRandom() {
		return isRandom;
	}

	public void setIsRandom(Integer isRandom) {
		this.isRandom = isRandom;
	}

	public Integer getMachineId() {
		return machineId;
	}

	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}

	public Integer getMaxBonus() {
		return maxBonus;
	}

	public void setMaxBonus(Integer maxBonus) {
		this.maxBonus = maxBonus;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public MachineInfo getMachine() {
		return machine;
	}

	public void setMachine(MachineInfo machine) {
		this.machine = machine;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public void setScene(Integer sceneId, String sceneName) {
		Scene scene= new Scene();
		scene.setId(sceneId);
		scene.setName(sceneName);
		this.scene=scene;
	}

	public void setStore(Integer storeId, String storeName, String address) {
		Store store = new Store();
		store.setId(storeId);
		store.setName(storeName);
		store.setAddress(address);
		this.store=store;
	}

}