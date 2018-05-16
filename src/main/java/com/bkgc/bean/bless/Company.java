package com.bkgc.bean.bless;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Company {
    private static final long serialVersionUID = 7629746774139114933L;

    private String id;

    private String name;

    private String phone;

    private String fax;

    private String email;

    private String address;

    private String postCode;

    private String contactPerson;

    private String contactPersonPhone;

    private String loginId;

    private Timestamp createTime;

    private String logoPath;

    public Integer channelId;

    private String guid;
}

