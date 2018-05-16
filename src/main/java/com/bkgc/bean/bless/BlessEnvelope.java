package com.bkgc.bean.bless;

import com.bkgc.bean.PageParam;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class BlessEnvelope extends PageParam {
    private static final long serialVersionUID = -9092189231010468401L;

    private String id;

    private Date createtime;

    private Integer type;

    private BigDecimal amount;

    private String lotterytickettypename;

    private String goodsid;

    private Date receiveexpiredtime;

    private String remark;

    private String fromuserid;

    private Integer fromusertype;

    private String receivememberid;

    private Date receivetime;

    private String receivelocation;

    private Integer isopened;

    private Date opentime;

    private String groupid;

    private String originalid;

    private String lastid;

    private Date posttime;

    private Integer isused;

    private Integer istransfer;

    private String thisday;

    private Date startTime;//开始时间

    private Date endTime;//结束时间

    private List<String> idList;

    private String name;

    private String phone;

    public BlessEnvelope() {
        // TODO Auto-generated constructor stub
    }

    public BlessEnvelope(String receivememberid, Integer isopened, Integer istransfer, Integer isused, Integer type) {
        this.receivememberid = receivememberid;
        this.isopened = isopened;
        this.istransfer = istransfer;
        this.isused = isused;
        this.type = type;
    }

    public BlessEnvelope(String receivememberid, Integer isopened) {
        this.receivememberid = receivememberid;
        this.isopened = isopened;
    }
}