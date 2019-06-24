package com.test.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class SYSTEM_LOG_OPERATION implements Serializable {
    private String ID;

    private String YHMC;

    private String YHID;

    private String DZ;

    private String MK;

    private String SJID;

    private String CZLX;

    private Date CZSJ;

    private String FFM;

    private String SJB;

    private String LM;

    private String BZ;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getYHMC() {
        return YHMC;
    }

    public void setYHMC(String YHMC) {
        this.YHMC = YHMC == null ? null : YHMC.trim();
    }

    public String getYHID() {
        return YHID;
    }

    public void setYHID(String YHID) {
        this.YHID = YHID == null ? null : YHID.trim();
    }

    public String getDZ() {
        return DZ;
    }

    public void setDZ(String DZ) {
        this.DZ = DZ == null ? null : DZ.trim();
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK == null ? null : MK.trim();
    }

    public String getSJID() {
        return SJID;
    }

    public void setSJID(String SJID) {
        this.SJID = SJID == null ? null : SJID.trim();
    }

    public String getCZLX() {
        return CZLX;
    }

    public void setCZLX(String CZLX) {
        this.CZLX = CZLX == null ? null : CZLX.trim();
    }

    public Date getCZSJ() {
        return CZSJ;
    }

    public void setCZSJ(Date CZSJ) {
        this.CZSJ = CZSJ;
    }

    public String getFFM() {
        return FFM;
    }

    public void setFFM(String FFM) {
        this.FFM = FFM == null ? null : FFM.trim();
    }

    public String getSJB() {
        return SJB;
    }

    public void setSJB(String SJB) {
        this.SJB = SJB == null ? null : SJB.trim();
    }

    public String getLM() {
        return LM;
    }

    public void setLM(String LM) {
        this.LM = LM == null ? null : LM.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
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
        SYSTEM_LOG_OPERATION other = (SYSTEM_LOG_OPERATION) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getYHMC() == null ? other.getYHMC() == null : this.getYHMC().equals(other.getYHMC()))
            && (this.getYHID() == null ? other.getYHID() == null : this.getYHID().equals(other.getYHID()))
            && (this.getDZ() == null ? other.getDZ() == null : this.getDZ().equals(other.getDZ()))
            && (this.getMK() == null ? other.getMK() == null : this.getMK().equals(other.getMK()))
            && (this.getSJID() == null ? other.getSJID() == null : this.getSJID().equals(other.getSJID()))
            && (this.getCZLX() == null ? other.getCZLX() == null : this.getCZLX().equals(other.getCZLX()))
            && (this.getCZSJ() == null ? other.getCZSJ() == null : this.getCZSJ().equals(other.getCZSJ()))
            && (this.getFFM() == null ? other.getFFM() == null : this.getFFM().equals(other.getFFM()))
            && (this.getSJB() == null ? other.getSJB() == null : this.getSJB().equals(other.getSJB()))
            && (this.getLM() == null ? other.getLM() == null : this.getLM().equals(other.getLM()))
            && (this.getBZ() == null ? other.getBZ() == null : this.getBZ().equals(other.getBZ()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getYHMC() == null) ? 0 : getYHMC().hashCode());
        result = prime * result + ((getYHID() == null) ? 0 : getYHID().hashCode());
        result = prime * result + ((getDZ() == null) ? 0 : getDZ().hashCode());
        result = prime * result + ((getMK() == null) ? 0 : getMK().hashCode());
        result = prime * result + ((getSJID() == null) ? 0 : getSJID().hashCode());
        result = prime * result + ((getCZLX() == null) ? 0 : getCZLX().hashCode());
        result = prime * result + ((getCZSJ() == null) ? 0 : getCZSJ().hashCode());
        result = prime * result + ((getFFM() == null) ? 0 : getFFM().hashCode());
        result = prime * result + ((getSJB() == null) ? 0 : getSJB().hashCode());
        result = prime * result + ((getLM() == null) ? 0 : getLM().hashCode());
        result = prime * result + ((getBZ() == null) ? 0 : getBZ().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", YHMC=").append(YHMC);
        sb.append(", YHID=").append(YHID);
        sb.append(", DZ=").append(DZ);
        sb.append(", MK=").append(MK);
        sb.append(", SJID=").append(SJID);
        sb.append(", CZLX=").append(CZLX);
        sb.append(", CZSJ=").append(CZSJ);
        sb.append(", FFM=").append(FFM);
        sb.append(", SJB=").append(SJB);
        sb.append(", LM=").append(LM);
        sb.append(", BZ=").append(BZ);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}