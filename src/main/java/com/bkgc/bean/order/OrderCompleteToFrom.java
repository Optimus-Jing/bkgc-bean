package com.bkgc.bean.order;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class OrderCompleteToFrom extends PageParam {

    private static final long serialVersionUID = 1L;

    private Integer machinePid;
    private String productName;
    private Integer productPrice;
    private Integer machineId; //自主机id
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


    private double tPrice;//20元区
    private double fPrice;//50元区
    private double hPrice;//100元区

    private double alipay;//支付宝支付
    private double wechat;//微信支付
    private double fujinpay;//福金支付

    private String startDateStr;
    private String endDateStr;
    private Integer userId;

}
