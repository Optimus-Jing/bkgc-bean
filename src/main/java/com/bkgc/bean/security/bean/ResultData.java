package com.bkgc.bean.security.bean;


import com.bkgc.bean.security.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;


/**
 * <p>Title:      ResultData </p>
 * <p>Description  </p>
 * <p>Company:    北控国彩 </p>
 *
 * @Author zhangft
 * @CreateDate 2017/5/31 下午3:09
 */
@Data
public class ResultData implements Serializable {

    private static final long serialVersionUID = 1L;

    //响应编码
    private String code;

    //响应信息
    private String msg;

    //数据
    private Object data;

    public void setResult(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode().toString();
        this.msg = resultCodeEnum.getMsg().toString();
    }
}
