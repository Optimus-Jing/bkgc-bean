package com.bkgc.bean.machine;

import java.util.Date;

public class AisleLog {
    private Integer id;

    private Integer machineProductId;

    private Integer machineId;

    private Integer count;

    private Integer operate;

    private Date ceateTime;

    private Date updateTime;
    
    private Integer storeId;

    private String storeName;

    private String aisleName;

    private String productName;

    private Integer price;

    private Integer userId;

    private Integer isDelete;
    
    private String productType;
    
    private Scene scene;
    
    private String storeAddress;
    
    private String channelName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMachineProductId() {
        return machineProductId;
    }

    public void setMachineProductId(Integer machineProductId) {
        this.machineProductId = machineProductId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    
    
    public Integer getOperate() {
		return operate;
	}

	public void setOperate(Integer operate) {
		this.operate = operate;
	}

	public Date getCeateTime() {
        return ceateTime;
    }

    public void setCeateTime(Date ceateTime) {
        this.ceateTime = ceateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
    public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName == null ? null : aisleName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

	public void setProductType(Object categoryName) {
		
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setScene(Integer sceneId, String sceneName) {
		Scene scene= new Scene();
		scene.setId(sceneId);
		scene.setName(sceneName);
		this.scene=scene;
	}

	public void setStoreAddress(String address) {
		this.storeAddress=address;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	
	
}