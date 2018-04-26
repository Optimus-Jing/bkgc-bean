package com.bkgc.bean.pay;

import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by jwalker on 2016年7月6日
 */
public class Response {
    public enum RESULT {
        ERROR(-1), SUCCESS(1), FAIL(0);
        private int result;

        RESULT(int i) {
            result = i;
        }
    }

    protected int result;
    protected String msg;
    protected Object data;


    public Response(RESULT result, String msg) {
        this.result = result.result;
        this.msg = msg;
        //this.data = new HashMap(0);
    }

    public Response(RESULT result, String msg, Object data) {
        this.result = result.result;
        this.msg = msg;
//		if (data == null)
//			data = new HashMap(0);
        this.data = data;
    }

    public Response(RESULT result, String msg, List data) {
        this.result = result.result;
        this.msg = msg;
//		if (data == null)
//			data = new ArrayList(0);
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getResult() {
        return result;
    }

    public void setResult(RESULT result) {
        this.result = result.result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
//		if (data == null)
//			data = new HashMap(0);
        this.data = data;
    }

    public void setData(List data) {
//		if (data == null)
//			data = new ArrayList(0);
        this.data = data;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
//		JSON.DEFFAULT_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
//		return JSON.toJSONString(this,SerializerFeature.WriteDateUseDateFormat);
        return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(this);
    }

}
