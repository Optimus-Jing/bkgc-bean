package com.bkgc.bean.bless;


import lombok.Data;

import java.util.Date;

@Data
public class RandomMappingGroup {

    private String id;

    //生成的七位随机数
    private String randomNumber;

    //随机数映射的福包组Id
    private String groupId;

    //福包组类型
    private Integer groupType;

    //映射地址
    private String groupURL;

    private Date createTime;
}
