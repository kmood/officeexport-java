package com.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class System_log_operation implements Serializable {
    private String id;

    private String yhmc;

    private String yhid;

    private String dz;

    private String mk;

    private String sjid;

    private String czlx;

    private Date czsj;

    private String ffm;

    private String bz;

    private String sjb;

    private String lm;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc == null ? null : yhmc.trim();
    }

    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz == null ? null : dz.trim();
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk == null ? null : mk.trim();
    }

    public String getSjid() {
        return sjid;
    }

    public void setSjid(String sjid) {
        this.sjid = sjid == null ? null : sjid.trim();
    }

    public String getCzlx() {
        return czlx;
    }

    public void setCzlx(String czlx) {
        this.czlx = czlx == null ? null : czlx.trim();
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public String getFfm() {
        return ffm;
    }

    public void setFfm(String ffm) {
        this.ffm = ffm == null ? null : ffm.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getSjb() {
        return sjb;
    }

    public void setSjb(String sjb) {
        this.sjb = sjb == null ? null : sjb.trim();
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm == null ? null : lm.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        System_log_operation other = (System_log_operation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYhmc() == null ? other.getYhmc() == null : this.getYhmc().equals(other.getYhmc()))
            && (this.getYhid() == null ? other.getYhid() == null : this.getYhid().equals(other.getYhid()))
            && (this.getDz() == null ? other.getDz() == null : this.getDz().equals(other.getDz()))
            && (this.getMk() == null ? other.getMk() == null : this.getMk().equals(other.getMk()))
            && (this.getSjid() == null ? other.getSjid() == null : this.getSjid().equals(other.getSjid()))
            && (this.getCzlx() == null ? other.getCzlx() == null : this.getCzlx().equals(other.getCzlx()))
            && (this.getCzsj() == null ? other.getCzsj() == null : this.getCzsj().equals(other.getCzsj()))
            && (this.getFfm() == null ? other.getFfm() == null : this.getFfm().equals(other.getFfm()))
            && (this.getBz() == null ? other.getBz() == null : this.getBz().equals(other.getBz()))
            && (this.getSjb() == null ? other.getSjb() == null : this.getSjb().equals(other.getSjb()))
            && (this.getLm() == null ? other.getLm() == null : this.getLm().equals(other.getLm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYhmc() == null) ? 0 : getYhmc().hashCode());
        result = prime * result + ((getYhid() == null) ? 0 : getYhid().hashCode());
        result = prime * result + ((getDz() == null) ? 0 : getDz().hashCode());
        result = prime * result + ((getMk() == null) ? 0 : getMk().hashCode());
        result = prime * result + ((getSjid() == null) ? 0 : getSjid().hashCode());
        result = prime * result + ((getCzlx() == null) ? 0 : getCzlx().hashCode());
        result = prime * result + ((getCzsj() == null) ? 0 : getCzsj().hashCode());
        result = prime * result + ((getFfm() == null) ? 0 : getFfm().hashCode());
        result = prime * result + ((getBz() == null) ? 0 : getBz().hashCode());
        result = prime * result + ((getSjb() == null) ? 0 : getSjb().hashCode());
        result = prime * result + ((getLm() == null) ? 0 : getLm().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", yhmc=").append(yhmc);
        sb.append(", yhid=").append(yhid);
        sb.append(", dz=").append(dz);
        sb.append(", mk=").append(mk);
        sb.append(", sjid=").append(sjid);
        sb.append(", czlx=").append(czlx);
        sb.append(", czsj=").append(czsj);
        sb.append(", ffm=").append(ffm);
        sb.append(", bz=").append(bz);
        sb.append(", sjb=").append(sjb);
        sb.append(", lm=").append(lm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}