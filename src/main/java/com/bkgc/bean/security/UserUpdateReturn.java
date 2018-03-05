package com.bkgc.bean.security;

/**
 * <p>Title:      UserUpdateReturn </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author         zhangft
 * @CreateDate     2017/5/31 下午4:16
 */
public class UserUpdateReturn {

    //修改条数
    private String updateCount;

    public String getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(String updateCount) {
        this.updateCount = updateCount;
    }

    @Override
    public String toString() {
        return "UserUpdateReturn{" +
                "updateCount='" + updateCount + '\'' +
                '}';
    }
}
