package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;
import lombok.Data;

@Data
public class FeedBack extends PageParam {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String userId;
    private String description;
    private String imgs;
    private String phone;
}
