package com.bkgc.bean.machine;

import lombok.Data;

import java.util.Date;

@Data
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

    public void setScene(Integer sceneId, String sceneName) {
        Scene scene = new Scene();
        scene.setId(sceneId);
        scene.setName(sceneName);
        this.scene = scene;
    }

}