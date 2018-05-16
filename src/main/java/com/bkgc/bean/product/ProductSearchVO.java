package com.bkgc.bean.product;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品搜索
 *
 * @author yq
 */

@Data
public class ProductSearchVO extends PageParam implements Serializable {

    private static final long serialVersionUID = -4910278194405927526L;

    private String name; //商品名称
    private String categoryName;//类别名称
    private int status;//状态
    private Date createTimeStart;//创建开始时间
    private Date createTimeEnd;//创建结束时间
}
