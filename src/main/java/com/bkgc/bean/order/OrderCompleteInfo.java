package com.bkgc.bean.order;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class OrderCompleteInfo extends PageParam implements Serializable {

    private static final long serialVersionUID = -420853785880371421L;
    private Integer machinePid;
    private String productName;
    private Integer productPrice;
    private String orderNo; //订单号
    private Date createTime; //创建时间
    private Integer orderPrice; //总价（以分为单位）
    private String payType; //支付类型
    private String tradeStatus; //交易状态
    private String shipStatus; //出货状态
    private Integer machineId; //自主机id
    private Integer userId; //自主机负责人id
    private Integer storeId; //店铺Id
    private String storeName; //店铺名称
    private String address; //地址
    private Integer channelIdOfloginUser;
    private Integer channelId; //渠道Id
    private String operator;//运营人员
    private String channelName; //渠道名称
    private int regionCode;//所属县区编码
    private String province; //省、直辖市、自治区
    private String city; //地区市、自治州
    private String district; //县、区、旗等

    private Date startDate; //查询生成订单起始时间
    private Date endDate; //查询生成订单结束时间
    private String userName; //用户名称

    private List<Integer> regionlist; //区域列表

}
