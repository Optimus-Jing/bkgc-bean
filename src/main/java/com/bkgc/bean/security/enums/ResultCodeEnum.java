package com.bkgc.bean.security.enums;

/**
 * <p>Title:      ResultCodeEnum </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午3:18
 */
public enum ResultCodeEnum {

    //===============请求通用====================
    SUCCESS("1000", "请求成功"),
    FAIL("0", "请求失败，请重试"),
    SERVICE_UNAVAILABLE("2000", "服务不可用"),
    //===============请求通用====================


    //===============4A安全平台错误编码(20xxx)====================
    NO_GRANT("2001", "授权权限不足"),
    USER_NOTEXIST("2002", "用户不存在"),
    USER_REG_FIAL("2003", "注册用户失败"),
    USER_UPDATE_FAIL("2004", "更新用户失败"),
    TOKEN_NULL("2010", "token不能为空"),
    TOKEN_INVILIDATE("2011", "无效的token"),
    TOKEN_EXPIRE("2013", "token已过期"),
    PARAM_MISS("2020", "缺少必选参数"),
    PARAM_INVIDATE("2021", "参数无效"),
    FILE_UPLOAD_FAIL("2022", "文件上传失败"),
    EXTEND_ERR("2023", "文件扩展名无效"),
    FORMAT_ERR("2024", "无效的数据格式"),
    DES_EXP("2025", "解密异常"),
    SIGN_CHECK_FAIL("2030", "签名校验失败"),
    MSG_CHECK_FAIL("2040", "短信验证失败"),
    MSG_TIMEOUT("2041", "短信验证码超时"),
    PHONE_EXIST("2042", "手机号已注册"),
    //===============4A安全平台错误编码(20xxx)====================


    //===============bkgc-payment错误编码(42xxx)=================
    ERR_42014("42014", "支付密码不正确"),
    ERR_42015("42015", "账户被锁定"),
    ERR_42016("42016", "请设置支付密码"),
    ERR_42017("42017", "用户账户不存在"),
    ERR_42018("42018", "订单不存在"),
    ERR_42019("42019", "订单已完成"),
    ERR_42020("42020", "订单已失效"),
    ERR_42021("42021", "福金余额不足"),
    ERR_42022("42022", "预付单不能重复生成"),
    ERR_42023("42023", "不支持的支付类型"),
    ERR_42024("42024", "支付宝签名失败"),
    ERR_42025("42025", "微信签名失败"),
    ERR_42026("42026", "预支付单不存在"),
    ERR_42027("42027", "预支付单尚未支付成功，不能退款"),
    ERR_42028("42028", "预付单支付已超时，请重新下单"),
    ERR_42029("42029", "该订单已支付成功，不能重复支付"),
    ERR_42030("42030", "转账金额不能大于账户金额"),
    ERR_42031("42031", "支付超时"),
    ERR_42032("42032", "短信验证码不正确"),
    ERR_42033("42033", "该退款单已经退款"),
    ERR_42034("42034", "退款失败[该订单未完成支付]"),
    ERR_42035("42035", "用户账户金额校验失败"),
    //===============bkgc-payment错误编码(42xxx)=================


    //===============bkgc-bless错误编码(41xxx)=================

    //===============bkgc-bless错误编码(41xxx)=================


    //===============bkgc-machine错误编码(43xxx)===============

    //===============bkgc-machine错误编码(43xxx)===============


    //===============bkgc-channel错误编码(44xxx)===============

    //===============bkgc-channel错误编码(44xxx)===============

    ;

    private String code;

    private String msg;

    ResultCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
