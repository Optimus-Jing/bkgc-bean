package com.bkgc.bean.vem;

import lombok.Data;

import java.util.Date;

@Data
public class VemMachineInstallDetail {
    private Integer id;

    /**
     * 关联主表id
     */
    private Integer installOrderId;

    /**
     * 机器编号
     */
    private Integer machineId;

    /**
     * 硬件编号
     */
    private String macNo;

    /**
     * 安装时间
     */
    private Date installDate;

    /**
     * 近景图片地址
     */
    private String imgNear;

    /**
     * 远景图片地址
     */
    private String imgFar;

    /**
     * 状态:1.带布放 2.布放完成
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否撤销: 0.否，1.是
     */
    private int isRevoke;


}