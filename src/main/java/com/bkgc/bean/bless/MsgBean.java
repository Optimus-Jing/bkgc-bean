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
     * 用户Id
     */
    private String userId;

}

