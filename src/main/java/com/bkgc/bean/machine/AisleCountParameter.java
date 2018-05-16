package com.bkgc.bean.machine;

import lombok.Data;

@Data
public class AisleCountParameter {
    private String userId;

    private Integer pageIndex;

    private Integer pageSize;

    private Integer terminal;

    private Integer channelId;
}
