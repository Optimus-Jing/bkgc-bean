package com.bkgc.bean.bless;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title:      BlessEnvelopeParam. </p>
 * <p>Description  福金福包转账接口参数</p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author <a href="zftbank@qq.com"/>张付涛</a>
 * @CreateDate 2017/5/27 14:28
 */
@Data
public class BlessEnvelopeParam implements Serializable {

    private static final long serialVersionUID = -7615582399365989403L;

    private String fromUserId;

    private String toUserId;

    private String money;

    private String remark;

}
