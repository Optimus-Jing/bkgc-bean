package com.bkgc.bean.machine;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class MachineInfoSearchVO extends PageParam {

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

}
