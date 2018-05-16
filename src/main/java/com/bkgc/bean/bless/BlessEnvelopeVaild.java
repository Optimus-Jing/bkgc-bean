package com.bkgc.bean.bless;


import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class BlessEnvelopeVaild extends PageParam {
    private static final long serialVersionUID = 1L;

    private String id;
    private String startTime;
    private String endTime;
    private String groupid;
    private Integer type;

    public BlessEnvelopeVaild() {

    }

    public BlessEnvelopeVaild(Integer pageStart, Integer pageSize, String id, String startTime, String endTime,
                              String groupid, Integer type) {
        super(pageStart, pageSize);
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.groupid = groupid;
        this.type = type;
    }
}
