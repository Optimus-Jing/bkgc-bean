package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import com.bkgc.bean.channel.Channel;
import com.bkgc.bean.store.Store;
import lombok.Data;

import java.util.Date;

@Data
public class Aisle extends PageParam {
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

    public void setScene(Integer sceneId, String sceneName) {
        Scene scene = new Scene();
        scene.setId(sceneId);
        scene.setName(sceneName);
        this.scene = scene;
    }

    public void setStore(Integer storeId, String storeName, String address) {
        Store store = new Store();
        store.setId(storeId);
        store.setName(storeName);
        store.setAddress(address);
        this.store = store;
    }

}