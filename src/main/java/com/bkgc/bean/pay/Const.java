package com.bkgc.bean.pay;

/**
 * Created by jwalker on 2016年7月4日
 */
public interface Const {
    String BASE_URL_BVI = "http://bvi2.8fubao.com/";

    String BASE_URL_VEMTP = "http://vemtp2.8fubao.com/";

    String BASE_URL_VEMMP = "http://vemmp2.8fubao.com/";

    String DBNAME = "dbName";

    String METHOD = "method";

    String SUCCESS = "成功";

    String FAIL = "失败";

    String EMPTY = "空数据";

    String ERROR = "无效请求";

    String VEM_NAME = "自助售货机";

    // -----------------支付类型名称 --------------------
    String WECHAT = "wechat"; // 微信
    String ALIPAY = "alipay"; // 支付宝
    String FUJINPAY = "fujinpay"; // 福金支付

    // ==================支付配置参数开始=========================
    // ------------------微信----------------------------
    String WX_APPID = "wxe921b5cf2891f3a5";

    String WX_MCHID = "1321703701";

    String WX_APPSECRET = "ec71b50580e41ec8a6c7f6f3c320a536";

    String WX_KEY = "16042ea0d982958a9c903b6e7cdea605";

    String WECHAT_NOTIFY_URL = BASE_URL_BVI + "payment/api/pay/callback/wechat";

    // 过期时间 默认57S, 对应自助机超时时间60s
    long WX_START_TIME_EXPIRE = 250000;
    long WX_TIME_EXPIRE = 50000;

    // NATIVE 原生扫码支付 取值：JSAPI NATIVE APP
    String WX_TRADE_TYPE = "NATIVE";

    // ------------------支付宝----------------------------
    String ALIPAY_GATEWAY = "https://openapi.alipay.com/gateway.do";
    String ALIPAY_APPID = "2016051001383218";
    String ALIPAY_APP_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL1VmYVu7yXJU0PcIopt4Q2gLxdZ7Y64ZuafIhqyzK0mAgP03H/gD0nAcOTW7d8ZPB6D3Xq5z4QfKRxQAcAjLkoOLnYnH8mOAo4ergO6bEEcLA0Le2fJ+fcHhFCuuj50e/Xochh1kLVOfpHMwi2PdSL31t8hVi5Sf2tX75QQKQANAgMBAAECgYBqon5vv3YjswsZai9uBcq+MNy06yo3urYB59h+bvuF/aUe81cJEnmp0SAEUuTwRTct/JjOGT6+LAqsboc93tKfWrQeB5ZhP3BVV2Yw/kPVwVmans/aP+5dtLC4Y3r/Sg8Jfv48cmMhhYXFf1fWWPICIAIrLjaH2bsa8wfEeJ+tBQJBAPvnx+oAA3VRWmNhKWNvGbbhQ3/gLihETgidqOzGKvWhXr3TbRJjoP9pKmLFQ1YuJ8fYph0Dm8vrTEVrm4hsZesCQQDAaXNdTzUhOA1xKW/eQxXePVbgSzAW/IKEP7U33q5xg7KKhS2Xkg/0rQ7E8GmFctIWRFHNVQi4bNHNRb26O9vnAkB3f0dNkP4S/CmltSS+H6kSISA1HDKpNWXTHn9Q+tzMMuXPpOk77Pkl0EykGDHOQwzp97MtVlXk0VUYJWjduZZLAkEAsMfx85gTk2rBhufwXUA7tk2bJUZPb78eV02FPUi985Nxla1Yvzq2qDHcMPtFqBNfjI/GrKXk9jUc6cGa2KGonwJAGPP1HgUNIH3A/K9l8X6B8kwespYRqdOrrqtocSdFBxWCs42IH3rGU3jKUwbPPwBm9/XZDs0W0+mYFMX0CgPh9g==";
    String ALIPAY_ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
    // 订单允许的最晚付款时间2分钟
    String ALIPAY_TIME_EXPIRE = "1m";
    String ALIPAY_NOTIFY_URL = BASE_URL_VEMTP + "vemtp/api/pay/callback/alipay";
    // ------------------福金----------------------------
    // 统一下单
    // String FUJIN_PRECREATE =
    // "http://182.92.197.24:8080/324/paycenter/01_pay.jsp";
    // String FUJIN_PRECREATE =
    String FUJIN_PRECREATE = BASE_URL_BVI + "bvi/paycenter/prepay";
    // String FUJIN_PRECREATE = "http://bvi.8fubao.com/bvi/paycenter/prepay";
    String FUJIN_KEY = "bc4849b791144513abbb01d74aa7fbab";
    String FUJIN_PARTNER = "16031321252255000202639";
    // ==================支付配置参数结束=========================

    /**
     * jpush
     */
    String JPUSH_MASTERSECRET = "4dd3021bcf0afd5d38ae230a";

    String JPUSH_APPKEY = "da530164e3ce03b28f10ead8";

    String JPUSH_ALERT = "Test from API Example - alert";

    /**
     * 操作类型（0补货、1下架、2减货）
     */
    int AISLE_OPERATE_ADD = 0;
    int AISLE_OPERATE_DOWN = 1;
    int AISLE_OPERATE_SUBTRACT = 2;
}
