package com.example.biz.module1.entity;

import java.io.Serializable;

public class GinwaQuanEntity  implements Serializable {

    private static final long serialVersionUID = 1L;

    //优惠券编码
    private Integer iyhqid;
    //优惠券描述
    private String syhqmc;
    //用券规则描述
    private String syhqms;
    //用券结束日期
    private String dyxq;
    //满减条件金额*100
    private Integer fjeLimit;
    // 满减后的金额*100
    private Integer fje;
    //是否满减
    private boolean manjian;
    //是否可用
    private boolean enable;

    public Integer getIyhqid() {
        return iyhqid;
    }

    public void setIyhqid(Integer iyhqid) {
        this.iyhqid = iyhqid;
    }

    public String getSyhqmc() {
        return syhqmc;
    }

    public void setSyhqmc(String syhqmc) {
        this.syhqmc = syhqmc;
    }

    public String getSyhqms() {
        return syhqms;
    }

    public void setSyhqms(String syhqms) {
        this.syhqms = syhqms;
    }

    public String getDyxq() {
        return dyxq;
    }

    public void setDyxq(String dyxq) {
        this.dyxq = dyxq;
    }

    public Integer getFjeLimit() {
        return fjeLimit;
    }

    public void setFjeLimit(Integer fjeLimit) {
        this.fjeLimit = fjeLimit;
    }

    public Integer getFje() {
        return fje;
    }

    public void setFje(Integer fje) {
        this.fje = fje;
    }

    public boolean isManjian() {
        return manjian;
    }

    public void setManjian(boolean manjian) {
        this.manjian = manjian;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "GinwaQuanEntity{" +
                "iyhqid=" + iyhqid +
                ", syhqmc='" + syhqmc + '\'' +
                ", syhqms='" + syhqms + '\'' +
                ", dyxq='" + dyxq + '\'' +
                ", fjeLimit=" + fjeLimit +
                ", fje=" + fje +
                ", manjian=" + manjian +
                ", enable=" + enable +
                '}';
    }
}
