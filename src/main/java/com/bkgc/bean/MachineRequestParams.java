package com.bkgc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MachineRequestParams implements Serializable {

    private static final long serialVersionUID = 71578004625259308L;

    private String channelIds;

    private String channelId;

    private List<Integer> idList;

    private String machineIds;
}
