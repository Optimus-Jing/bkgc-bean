package com.bkgc.bean.pay;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayCompany extends PageParam {
    private static final long serialVersionUID = -939528662284598350L;

    private String ids;

    private String companyname;

    private String email;

    private String username;

    private String password;

    private String secretkey;

    private BigDecimal maxcount;

    private String remark;

    private String rsapublickey;

    private String rsaprivatekey;

    private String companyid;

}