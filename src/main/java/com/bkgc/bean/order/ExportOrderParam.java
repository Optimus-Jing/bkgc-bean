package com.bkgc.bean.order;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExportOrderParam implements Serializable {

    private static final long serialVersionUID = 9155591802274137970L;


    public ExportOrderParam() {
    }

    private Integer channelId;
    private Date startDate;
    private String startDateStr;
    private Date endDate;
    private String endDateStr;
    private String userName;
    private String viewName = "OrderCompInfo_View_";
    private Integer userId;

    public ExportOrderParam(Integer channelId, String userName) {
        this.channelId = channelId;
        this.userName = userName;
        this.viewName = this.viewName.concat(userName);
    }

    public void setUserName(String userName) {
        this.userName = userName;
        this.viewName = this.viewName.concat(userName);
    }

}
