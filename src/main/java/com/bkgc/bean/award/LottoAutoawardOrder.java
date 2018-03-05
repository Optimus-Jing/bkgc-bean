package com.bkgc.bean.award;

import java.util.Date;

public class LottoAutoawardOrder {
    /**
     * 编号
     */
    private String id;

    /**
     * 兑奖订单号
     */
    private String orderno;

    /**
     * 兑奖用户Id
     */
    private String userid;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 兑奖请求时间
     */
    private Date requesttime;

    private int requesttype;

    /**
     * 是否正在被处理（0：否；1：是）
     */
    private Integer islocked;

    /**
     * 锁失效时间
     */
    private Date lockexpired;

    /**
     * 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    private String validcode;

    /**
     * 保安区二维码
     */
    private String safeqr;

    /**
     * 物流二维码
     */
    private String transportqr;

    /**
     * 票号
     */
    private String ticketno;

    /**
     * 手动兑奖输入的兑奖码
     */
    private String awardno;

    /**
     * 彩票类别1单码票；2双码票
     */
    private Integer tickettype;

    /**
     * 操作员（兑奖员）Id
     */
    private String awarderid;

    /**
     * 兑奖奖项处理时间
     */
    private Date awardtime;

    /**
     * 兑奖操作员IP
     */
    private String awarderip;

    /**
     * 奖项（1-12）
     */
    private Integer awardlevel;

    /**
     * 1:自动兑奖;2人工兑奖
     */
    private Integer awardflag;

    /**
     * 兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     */
    private Integer awardstatus;

    /**
     * 1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     */
    private Integer awardresulttype;

    /**
     * 奖金
     */
    private Integer awardmoney;

    /**
     * 兼容1.0版本ios所建的
     */
    private String appversion;

    /**
     * 省份编码
     */
    private Integer provinceid;

    private String awarddeviceid;

    /**
     * 门店编号
     */
    private String customerno;

    /**
     * 设备编码
     */
    private String terminalno;

    /**
     * 供应商编码
     */
    private String providerno;

    /**
     * 游戏编码
     */
    private String gameno;

    /**
     * 包号
     */
    private String packageno;

    /**
     * 票序号
     */
    private String ticketserialno;


    /**
     * 游戏名称
     */
    private String instantgamename;

    /**
     * 彩种编码
     */
    private String instantgameno;

    /**
     * 奖项等级
     */
    private String instantprizelevel;


    /**
     * 体彩接口返回数据
     */
    private String autoawardremark;

    /**
     * 备注
     */
    private String remark;

    /**
     * 自动兑奖状态
     */
    private Integer autoawardstatus;

    /**
     * 系统处理异常编码
     */
    private Integer exceptioncode;

    /**
     * 系统处理异常描述
     */
    private String exceptiondesc;

    private String tenMinsBefore;

    private String awardstatusname;

    private String requesttypename;


    /**
     * 获取编号
     *
     * @return Id - 编号
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
     * 获取兑奖订单号
     *
     * @return OrderNo - 兑奖订单号
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * 设置兑奖订单号
     *
     * @param orderno 兑奖订单号
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * 获取兑奖用户Id
     *
     * @return UserId - 兑奖用户Id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置兑奖用户Id
     *
     * @param userid 兑奖用户Id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取用户手机号
     *
     * @return Phone - 用户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号
     *
     * @param phone 用户手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取兑奖请求时间
     *
     * @return RequestTime - 兑奖请求时间
     */
    public Date getRequesttime() {
        return requesttime;
    }

    /**
     * 设置兑奖请求时间
     *
     * @param requesttime 兑奖请求时间
     */
    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    /**
     * 获取是否正在被处理（0：否；1：是）
     *
     * @return IsLocked - 是否正在被处理（0：否；1：是）
     */
    public Integer getIslocked() {
        return islocked;
    }

    /**
     * 设置是否正在被处理（0：否；1：是）
     *
     * @param islocked 是否正在被处理（0：否；1：是）
     */
    public void setIslocked(Integer islocked) {
        this.islocked = islocked;
    }

    /**
     * 获取锁失效时间
     *
     * @return LockExpired - 锁失效时间
     */
    public Date getLockexpired() {
        return lockexpired;
    }

    /**
     * 设置锁失效时间
     *
     * @param lockexpired 锁失效时间
     */
    public void setLockexpired(Date lockexpired) {
        this.lockexpired = lockexpired;
    }

    /**
     * 获取校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     *
     * @return ValidCode - 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    public String getValidcode() {
        return validcode;
    }

    /**
     * 设置校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     *
     * @param validcode 校验码(时间、金额、会员类型、会员编号加密字符串)，用于防止人为篡改数据
     */
    public void setValidcode(String validcode) {
        this.validcode = validcode;
    }

    /**
     * 获取保安区二维码
     *
     * @return SafeQR - 保安区二维码
     */
    public String getSafeqr() {
        return safeqr;
    }

    /**
     * 设置保安区二维码
     *
     * @param safeqr 保安区二维码
     */
    public void setSafeqr(String safeqr) {
        this.safeqr = safeqr;
    }

    /**
     * 获取物流二维码
     *
     * @return TransportQR - 物流二维码
     */
    public String getTransportqr() {
        return transportqr;
    }

    /**
     * 设置物流二维码
     *
     * @param transportqr 物流二维码
     */
    public void setTransportqr(String transportqr) {
        this.transportqr = transportqr;
    }

    /**
     * 获取票号
     *
     * @return TicketNo - 票号
     */
    public String getTicketno() {
        return ticketno;
    }

    /**
     * 设置票号
     *
     * @param ticketno 票号
     */
    public void setTicketno(String ticketno) {
        this.ticketno = ticketno;
    }

    /**
     * 获取手动兑奖输入的兑奖码
     *
     * @return AwardNo - 手动兑奖输入的兑奖码
     */
    public String getAwardno() {
        return awardno;
    }

    /**
     * 设置手动兑奖输入的兑奖码
     *
     * @param awardno 手动兑奖输入的兑奖码
     */
    public void setAwardno(String awardno) {
        this.awardno = awardno;
    }

    /**
     * 获取彩票类别1单码票；2双码票
     *
     * @return TicketType - 彩票类别1单码票；2双码票
     */
    public Integer getTickettype() {
        return tickettype;
    }

    /**
     * 设置彩票类别1单码票；2双码票
     *
     * @param tickettype 彩票类别1单码票；2双码票
     */
    public void setTickettype(Integer tickettype) {
        this.tickettype = tickettype;
    }

    /**
     * 获取操作员（兑奖员）Id
     *
     * @return AwarderId - 操作员（兑奖员）Id
     */
    public String getAwarderid() {
        return awarderid;
    }

    /**
     * 设置操作员（兑奖员）Id
     *
     * @param awarderid 操作员（兑奖员）Id
     */
    public void setAwarderid(String awarderid) {
        this.awarderid = awarderid;
    }

    /**
     * 获取兑奖奖项处理时间
     *
     * @return AwardTime - 兑奖奖项处理时间
     */
    public Date getAwardtime() {
        return awardtime;
    }

    /**
     * 设置兑奖奖项处理时间
     *
     * @param awardtime 兑奖奖项处理时间
     */
    public void setAwardtime(Date awardtime) {
        this.awardtime = awardtime;
    }

    /**
     * 获取兑奖操作员IP
     *
     * @return AwarderIp - 兑奖操作员IP
     */
    public String getAwarderip() {
        return awarderip;
    }

    /**
     * 设置兑奖操作员IP
     *
     * @param awarderip 兑奖操作员IP
     */
    public void setAwarderip(String awarderip) {
        this.awarderip = awarderip;
    }

    /**
     * 获取奖项（1-12）
     *
     * @return AwardLevel - 奖项（1-12）
     */
    public Integer getAwardlevel() {
        return awardlevel;
    }

    /**
     * 设置奖项（1-12）
     *
     * @param awardlevel 奖项（1-12）
     */
    public void setAwardlevel(Integer awardlevel) {
        this.awardlevel = awardlevel;
    }

    /**
     * 获取1:自动兑奖;2人工兑奖
     *
     * @return AwardFlag - 1:自动兑奖;2人工兑奖
     */
    public Integer getAwardflag() {
        return awardflag;
    }

    /**
     * 设置1:自动兑奖;2人工兑奖
     *
     * @param awardflag 1:自动兑奖;2人工兑奖
     */
    public void setAwardflag(Integer awardflag) {
        this.awardflag = awardflag;
    }

    /**
     * 获取兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     *
     * @return AwardStatus - 兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     */
    public Integer getAwardstatus() {
        return awardstatus;
    }

    /**
     * 设置兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     *
     * @param awardstatus 兑奖状态（0未兑奖|1兑奖成功|2兑奖失败）
     */
    public void setAwardstatus(Integer awardstatus) {
        this.awardstatus = awardstatus;
    }

    /**
     * 获取1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     *
     * @return AwardResultType - 1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     */
    public Integer getAwardresulttype() {
        return awardresulttype;
    }

    /**
     * 设置1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     *
     * @param awardresulttype 1.中奖（奖金额度小于10000）2.中奖（奖金额度大于10000）3.彩票未中奖 4.票号和兑奖码不匹配,无法兑奖 5.该票已兑过奖，请勿重复兑奖 6.票号或兑奖码输入不正确，不能兑奖
     */
    public void setAwardresulttype(Integer awardresulttype) {
        this.awardresulttype = awardresulttype;
    }

    /**
     * 获取奖金
     *
     * @return AwardMoney - 奖金
     */
    public Integer getAwardmoney() {
        return awardmoney;
    }

    /**
     * 设置奖金
     *
     * @param awardmoney 奖金
     */
    public void setAwardmoney(Integer awardmoney) {
        this.awardmoney = awardmoney;
    }

    /**
     * 获取兼容1.0版本ios所建的
     *
     * @return appVersion - 兼容1.0版本ios所建的
     */
    public String getAppversion() {
        return appversion;
    }

    /**
     * 设置兼容1.0版本ios所建的
     *
     * @param appversion 兼容1.0版本ios所建的
     */
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    /**
     * 获取省份编码
     *
     * @return ProvinceId - 省份编码
     */
    public Integer getProvinceid() {
        return provinceid;
    }

    /**
     * 设置省份编码
     *
     * @param provinceid 省份编码
     */
    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * @return AwardDeviceId
     */
    public String getAwarddeviceid() {
        return awarddeviceid;
    }

    /**
     * @param awarddeviceid
     */
    public void setAwarddeviceid(String awarddeviceid) {
        this.awarddeviceid = awarddeviceid;
    }

    /**
     * 获取门店编号
     *
     * @return CustomerNo - 门店编号
     */
    public String getCustomerno() {
        return customerno;
    }

    /**
     * 设置门店编号
     *
     * @param customerno 门店编号
     */
    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    /**
     * 获取设备编码
     *
     * @return TerminalNo - 设备编码
     */
    public String getTerminalno() {
        return terminalno;
    }

    /**
     * 设置设备编码
     *
     * @param terminalno 设备编码
     */
    public void setTerminalno(String terminalno) {
        this.terminalno = terminalno;
    }

    /**
     * 获取供应商编码
     *
     * @return ProviderNo - 供应商编码
     */
    public String getProviderno() {
        return providerno;
    }

    /**
     * 设置供应商编码
     *
     * @param providerno 供应商编码
     */
    public void setProviderno(String providerno) {
        this.providerno = providerno;
    }

    /**
     * 获取游戏编码
     *
     * @return GameNo - 游戏编码
     */
    public String getGameno() {
        return gameno;
    }

    /**
     * 设置游戏编码
     *
     * @param gameno 游戏编码
     */
    public void setGameno(String gameno) {
        this.gameno = gameno;
    }

    /**
     * 获取包号
     *
     * @return PackageNo - 包号
     */
    public String getPackageno() {
        return packageno;
    }

    /**
     * 设置包号
     *
     * @param packageno 包号
     */
    public void setPackageno(String packageno) {
        this.packageno = packageno;
    }

    /**
     * 获取票序号
     *
     * @return TicketSerialNo - 票序号
     */
    public String getTicketserialno() {
        return ticketserialno;
    }

    /**
     * 设置票序号
     *
     * @param ticketserialno 票序号
     */
    public void setTicketserialno(String ticketserialno) {
        this.ticketserialno = ticketserialno;
    }

    /**
     * 获取体彩接口返回数据
     *
     * @return AutoAwardRemark - 体彩接口返回数据
     */
    public String getAutoawardremark() {
        return autoawardremark;
    }

    /**
     * 设置体彩接口返回数据
     *
     * @param autoawardremark 体彩接口返回数据
     */
    public void setAutoawardremark(String autoawardremark) {
        this.autoawardremark = autoawardremark;
    }

    /**
     * 获取备注
     *
     * @return Remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(int requesttype) {
        this.requesttype = requesttype;
    }

    public Integer getAutoawardstatus() {
        return autoawardstatus;
    }

    public void setAutoawardstatus(Integer autoawardstatus) {
        this.autoawardstatus = autoawardstatus;
    }

    public Integer getExceptioncode() {
        return exceptioncode;
    }

    public void setExceptioncode(Integer exceptioncode) {
        this.exceptioncode = exceptioncode;
    }

    public String getExceptiondesc() {
        return exceptiondesc;
    }

    public void setExceptiondesc(String exceptiondesc) {
        this.exceptiondesc = exceptiondesc;
    }

    public String getTenMinsBefore() {
        return tenMinsBefore;
    }

    public void setTenMinsBefore(String tenMinsBefore) {
        this.tenMinsBefore = tenMinsBefore;
    }

    public String getAwardstatusname() {
        return awardstatusname;
    }

    public void setAwardstatusname(String awardstatusname) {
        this.awardstatusname = awardstatusname;
    }

    public String getRequesttypename() {
        return requesttypename;
    }

    public void setRequesttypename(String requesttypename) {
        this.requesttypename = requesttypename;
    }

    public String getInstantgamename() {
        return instantgamename;
    }

    public void setInstantgamename(String instantgamename) {
        this.instantgamename = instantgamename;
    }

    public String getInstantgameno() {
        return instantgameno;
    }

    public void setInstantgameno(String instantgameno) {
        this.instantgameno = instantgameno;
    }

    public String getInstantprizelevel() {
        return instantprizelevel;
    }

    public void setInstantprizelevel(String instantprizelevel) {
        this.instantprizelevel = instantprizelevel;
    }

    @Override
    public String toString() {
        return "LottoAutoawardOrder{" +
                "id='" + id + '\'' +
                ", orderno='" + orderno + '\'' +
                ", userid='" + userid + '\'' +
                ", phone='" + phone + '\'' +
                ", requesttime=" + requesttime +
                ", requesttype=" + requesttype +
                ", islocked=" + islocked +
                ", lockexpired=" + lockexpired +
                ", validcode='" + validcode + '\'' +
                ", safeqr='" + safeqr + '\'' +
                ", transportqr='" + transportqr + '\'' +
                ", ticketno='" + ticketno + '\'' +
                ", awardno='" + awardno + '\'' +
                ", tickettype=" + tickettype +
                ", awarderid='" + awarderid + '\'' +
                ", awardtime=" + awardtime +
                ", awarderip='" + awarderip + '\'' +
                ", awardlevel=" + awardlevel +
                ", awardflag=" + awardflag +
                ", awardstatus=" + awardstatus +
                ", awardresulttype=" + awardresulttype +
                ", awardmoney=" + awardmoney +
                ", appversion='" + appversion + '\'' +
                ", provinceid=" + provinceid +
                ", awarddeviceid='" + awarddeviceid + '\'' +
                ", customerno='" + customerno + '\'' +
                ", terminalno='" + terminalno + '\'' +
                ", providerno='" + providerno + '\'' +
                ", gameno='" + gameno + '\'' +
                ", packageno='" + packageno + '\'' +
                ", ticketserialno='" + ticketserialno + '\'' +
                ", instantgamename='" + instantgamename + '\'' +
                ", instantgameno='" + instantgameno + '\'' +
                ", instantprizelevel='" + instantprizelevel + '\'' +
                ", autoawardremark='" + autoawardremark + '\'' +
                ", remark='" + remark + '\'' +
                ", autoawardstatus=" + autoawardstatus +
                ", exceptioncode=" + exceptioncode +
                ", exceptiondesc='" + exceptiondesc + '\'' +
                ", tenMinsBefore='" + tenMinsBefore + '\'' +
                ", awardstatusname='" + awardstatusname + '\'' +
                ", requesttypename='" + requesttypename + '\'' +
                '}';
    }
}