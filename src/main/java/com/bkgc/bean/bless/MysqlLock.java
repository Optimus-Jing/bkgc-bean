package com.bkgc.bean.bless;

import java.util.Date;

public class MysqlLock {
    /**
     * 编号
     */
    private String id;

    /**
     * 随机值
     */
    private String randstr;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取随机值
     *
     * @return randStr - 随机值
     */
    public String getRandstr() {
        return randstr;
    }

    /**
     * 设置随机值
     *
     * @param randstr 随机值
     */
    public void setRandstr(String randstr) {
        this.randstr = randstr;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取过期时间
     *
     * @return expire_time - 过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置过期时间
     *
     * @param expireTime 过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}