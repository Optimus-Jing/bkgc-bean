package com.bkgc.bean.pay;

/**
 * <p>Title:      PaySecretErrorEnum </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/6/8 上午10:19
 */
public enum PaySecretErrorEnum {

    //密码错误次数从大到小排列
    Pay_Err_A(5, 10, "账户已锁定，请10分钟后再试"),
    Pay_Err_B(10, 60, "账户已锁定，请1个小时后再试"),
    Pay_Err_C(15, 60 * 24, "输入密码次数太多，账户被锁定一天");


    private int count;

    private int minutes;

    private String desc;

    PaySecretErrorEnum(int count,int minutes,String desc){
        this.count = count;
        this.minutes = minutes;
        this.desc = desc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
