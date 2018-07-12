package com.bkgc.bean.bless;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Dylan on 2018/7/12.
 */
@NoArgsConstructor
@Data
public class MsgBean {

    private int  pageNum;
    private int  pageSize;
    /**
     * 消息类型
     */
    private String msgType;


    public MsgBean(int pageSize, int pageNum) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public MsgBean(int pageNum, int pageSize, String msgType) {
        this(pageSize,pageNum);
        this.msgType = msgType;
    }

}

