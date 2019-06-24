package com.test.project.basic.entity;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XMGL_XMXX implements Serializable {

    private String ID;

    private String XMBH;

    private String YLXMC;
    @ExcelProperty(index = 6)
    private String XMJC;
    @ExcelProperty(index = 5)
    private String XMMC;
    @ExcelProperty(index = 7)
    private String YZDW;

    private String SQBMID;

    private String CDBMID;

    private String XMJLID;

    private String XMZLID;

    private String JSJLID;

    private String JSZLID;

    private String CSJMGDFWRWYQ;

    private Integer XMLX;
    @ExcelProperty(index = 1)
    private String XMND;
    @ExcelProperty(index = 2)
    private String HTBH;

    private Integer SSHY;

    private Integer XMZT;

    private Date XDRQ;

    private Integer XMFZ;

    private Integer GSXM;

    private Date KSRQ;

    private Date JZRQ;

    private String XMZL;

    private String BZ;

    private String YLXSJID;

    private String SHZT;

    private String ZGLDID;

    private String XGLDID;

    private String CDYWZX;

    private String CDYWZXFZRID;

    private String CDBMFZRID;

    private String WCZT;

    private String BXZT;

    private String SFQC;

    private String CDSYBID;

    private String XMJD;

    private BigDecimal XMZJF;

    private BigDecimal HBJF;

    private String HBJFBL;

    private String SYBFZRID;

    private String YSTJ;

    private String SFSD;

    private String SFYX;

    private Date CJSJ;

    private String CJRID;

    private String SFXZXM;

    private String PID;

    private String HTMC;

    private String HTID;

    private String RWYQ;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getXMBH() {
        return XMBH;
    }

    public void setXMBH(String XMBH) {
        this.XMBH = XMBH == null ? null : XMBH.trim();
    }

    public String getYLXMC() {
        return YLXMC;
    }

    public void setYLXMC(String YLXMC) {
        this.YLXMC = YLXMC == null ? null : YLXMC.trim();
    }

    public String getXMJC() {
        return XMJC;
    }

    public void setXMJC(String XMJC) {
        this.XMJC = XMJC == null ? null : XMJC.trim();
    }

    public String getXMMC() {
        return XMMC;
    }

    public void setXMMC(String XMMC) {
        this.XMMC = XMMC == null ? null : XMMC.trim();
    }

    public String getYZDW() {
        return YZDW;
    }

    public void setYZDW(String YZDW) {
        this.YZDW = YZDW == null ? null : YZDW.trim();
    }

    public String getSQBMID() {
        return SQBMID;
    }

    public void setSQBMID(String SQBMID) {
        this.SQBMID = SQBMID == null ? null : SQBMID.trim();
    }

    public String getCDBMID() {
        return CDBMID;
    }

    public void setCDBMID(String CDBMID) {
        this.CDBMID = CDBMID == null ? null : CDBMID.trim();
    }

    public String getXMJLID() {
        return XMJLID;
    }

    public void setXMJLID(String XMJLID) {
        this.XMJLID = XMJLID == null ? null : XMJLID.trim();
    }

    public String getXMZLID() {
        return XMZLID;
    }

    public void setXMZLID(String XMZLID) {
        this.XMZLID = XMZLID == null ? null : XMZLID.trim();
    }

    public String getJSJLID() {
        return JSJLID;
    }

    public void setJSJLID(String JSJLID) {
        this.JSJLID = JSJLID == null ? null : JSJLID.trim();
    }

    public String getJSZLID() {
        return JSZLID;
    }

    public void setJSZLID(String JSZLID) {
        this.JSZLID = JSZLID == null ? null : JSZLID.trim();
    }

    public String getCSJMGDFWRWYQ() {
        return CSJMGDFWRWYQ;
    }

    public void setCSJMGDFWRWYQ(String CSJMGDFWRWYQ) {
        this.CSJMGDFWRWYQ = CSJMGDFWRWYQ == null ? null : CSJMGDFWRWYQ.trim();
    }

    public Integer getXMLX() {
        return XMLX;
    }

    public void setXMLX(Integer XMLX) {
        this.XMLX = XMLX;
    }

    public String getXMND() {
        return XMND;
    }

    public void setXMND(String XMND) {
        this.XMND = XMND == null ? null : XMND.trim();
    }

    public String getHTBH() {
        return HTBH;
    }

    public void setHTBH(String HTBH) {
        this.HTBH = HTBH == null ? null : HTBH.trim();
    }

    public Integer getSSHY() {
        return SSHY;
    }

    public void setSSHY(Integer SSHY) {
        this.SSHY = SSHY;
    }

    public Integer getXMZT() {
        return XMZT;
    }

    public void setXMZT(Integer XMZT) {
        this.XMZT = XMZT;
    }

    public Date getXDRQ() {
        return XDRQ;
    }

    public void setXDRQ(Date XDRQ) {
        this.XDRQ = XDRQ;
    }

    public Integer getXMFZ() {
        return XMFZ;
    }

    public void setXMFZ(Integer XMFZ) {
        this.XMFZ = XMFZ;
    }

    public Integer getGSXM() {
        return GSXM;
    }

    public void setGSXM(Integer GSXM) {
        this.GSXM = GSXM;
    }

    public Date getKSRQ() {
        return KSRQ;
    }

    public void setKSRQ(Date KSRQ) {
        this.KSRQ = KSRQ;
    }

    public Date getJZRQ() {
        return JZRQ;
    }

    public void setJZRQ(Date JZRQ) {
        this.JZRQ = JZRQ;
    }

    public String getXMZL() {
        return XMZL;
    }

    public void setXMZL(String XMZL) {
        this.XMZL = XMZL == null ? null : XMZL.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    public String getYLXSJID() {
        return YLXSJID;
    }

    public void setYLXSJID(String YLXSJID) {
        this.YLXSJID = YLXSJID == null ? null : YLXSJID.trim();
    }

    public String getSHZT() {
        return SHZT;
    }

    public void setSHZT(String SHZT) {
        this.SHZT = SHZT == null ? null : SHZT.trim();
    }

    public String getZGLDID() {
        return ZGLDID;
    }

    public void setZGLDID(String ZGLDID) {
        this.ZGLDID = ZGLDID == null ? null : ZGLDID.trim();
    }

    public String getXGLDID() {
        return XGLDID;
    }

    public void setXGLDID(String XGLDID) {
        this.XGLDID = XGLDID == null ? null : XGLDID.trim();
    }

    public String getCDYWZX() {
        return CDYWZX;
    }

    public void setCDYWZX(String CDYWZX) {
        this.CDYWZX = CDYWZX == null ? null : CDYWZX.trim();
    }

    public String getCDYWZXFZRID() {
        return CDYWZXFZRID;
    }

    public void setCDYWZXFZRID(String CDYWZXFZRID) {
        this.CDYWZXFZRID = CDYWZXFZRID == null ? null : CDYWZXFZRID.trim();
    }

    public String getCDBMFZRID() {
        return CDBMFZRID;
    }

    public void setCDBMFZRID(String CDBMFZRID) {
        this.CDBMFZRID = CDBMFZRID == null ? null : CDBMFZRID.trim();
    }

    public String getWCZT() {
        return WCZT;
    }

    public void setWCZT(String WCZT) {
        this.WCZT = WCZT == null ? null : WCZT.trim();
    }

    public String getBXZT() {
        return BXZT;
    }

    public void setBXZT(String BXZT) {
        this.BXZT = BXZT == null ? null : BXZT.trim();
    }

    public String getSFQC() {
        return SFQC;
    }

    public void setSFQC(String SFQC) {
        this.SFQC = SFQC == null ? null : SFQC.trim();
    }

    public String getCDSYBID() {
        return CDSYBID;
    }

    public void setCDSYBID(String CDSYBID) {
        this.CDSYBID = CDSYBID == null ? null : CDSYBID.trim();
    }

    public String getXMJD() {
        return XMJD;
    }

    public void setXMJD(String XMJD) {
        this.XMJD = XMJD == null ? null : XMJD.trim();
    }

    public BigDecimal getXMZJF() {
        return XMZJF;
    }

    public void setXMZJF(BigDecimal XMZJF) {
        this.XMZJF = XMZJF;
    }

    public BigDecimal getHBJF() {
        return HBJF;
    }

    public void setHBJF(BigDecimal HBJF) {
        this.HBJF = HBJF;
    }

    public String getHBJFBL() {
        return HBJFBL;
    }

    public void setHBJFBL(String HBJFBL) {
        this.HBJFBL = HBJFBL == null ? null : HBJFBL.trim();
    }

    public String getSYBFZRID() {
        return SYBFZRID;
    }

    public void setSYBFZRID(String SYBFZRID) {
        this.SYBFZRID = SYBFZRID == null ? null : SYBFZRID.trim();
    }

    public String getYSTJ() {
        return YSTJ;
    }

    public void setYSTJ(String YSTJ) {
        this.YSTJ = YSTJ == null ? null : YSTJ.trim();
    }

    public String getSFSD() {
        return SFSD;
    }

    public void setSFSD(String SFSD) {
        this.SFSD = SFSD == null ? null : SFSD.trim();
    }

    public String getSFYX() {
        return SFYX;
    }

    public void setSFYX(String SFYX) {
        this.SFYX = SFYX == null ? null : SFYX.trim();
    }

    public Date getCJSJ() {
        return CJSJ;
    }

    public void setCJSJ(Date CJSJ) {
        this.CJSJ = CJSJ;
    }

    public String getCJRID() {
        return CJRID;
    }

    public void setCJRID(String CJRID) {
        this.CJRID = CJRID == null ? null : CJRID.trim();
    }

    public String getSFXZXM() {
        return SFXZXM;
    }

    public void setSFXZXM(String SFXZXM) {
        this.SFXZXM = SFXZXM == null ? null : SFXZXM.trim();
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID == null ? null : PID.trim();
    }

    public String getHTMC() {
        return HTMC;
    }

    public void setHTMC(String HTMC) {
        this.HTMC = HTMC == null ? null : HTMC.trim();
    }

    public String getHTID() {
        return HTID;
    }

    public void setHTID(String HTID) {
        this.HTID = HTID == null ? null : HTID.trim();
    }

    public String getRWYQ() {
        return RWYQ;
    }

    public void setRWYQ(String RWYQ) {
        this.RWYQ = RWYQ == null ? null : RWYQ.trim();
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
        XMGL_XMXX other = (XMGL_XMXX) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getXMBH() == null ? other.getXMBH() == null : this.getXMBH().equals(other.getXMBH()))
            && (this.getYLXMC() == null ? other.getYLXMC() == null : this.getYLXMC().equals(other.getYLXMC()))
            && (this.getXMJC() == null ? other.getXMJC() == null : this.getXMJC().equals(other.getXMJC()))
            && (this.getXMMC() == null ? other.getXMMC() == null : this.getXMMC().equals(other.getXMMC()))
            && (this.getYZDW() == null ? other.getYZDW() == null : this.getYZDW().equals(other.getYZDW()))
            && (this.getSQBMID() == null ? other.getSQBMID() == null : this.getSQBMID().equals(other.getSQBMID()))
            && (this.getCDBMID() == null ? other.getCDBMID() == null : this.getCDBMID().equals(other.getCDBMID()))
            && (this.getXMJLID() == null ? other.getXMJLID() == null : this.getXMJLID().equals(other.getXMJLID()))
            && (this.getXMZLID() == null ? other.getXMZLID() == null : this.getXMZLID().equals(other.getXMZLID()))
            && (this.getJSJLID() == null ? other.getJSJLID() == null : this.getJSJLID().equals(other.getJSJLID()))
            && (this.getJSZLID() == null ? other.getJSZLID() == null : this.getJSZLID().equals(other.getJSZLID()))
            && (this.getCSJMGDFWRWYQ() == null ? other.getCSJMGDFWRWYQ() == null : this.getCSJMGDFWRWYQ().equals(other.getCSJMGDFWRWYQ()))
            && (this.getXMLX() == null ? other.getXMLX() == null : this.getXMLX().equals(other.getXMLX()))
            && (this.getXMND() == null ? other.getXMND() == null : this.getXMND().equals(other.getXMND()))
            && (this.getHTBH() == null ? other.getHTBH() == null : this.getHTBH().equals(other.getHTBH()))
            && (this.getSSHY() == null ? other.getSSHY() == null : this.getSSHY().equals(other.getSSHY()))
            && (this.getXMZT() == null ? other.getXMZT() == null : this.getXMZT().equals(other.getXMZT()))
            && (this.getXDRQ() == null ? other.getXDRQ() == null : this.getXDRQ().equals(other.getXDRQ()))
            && (this.getXMFZ() == null ? other.getXMFZ() == null : this.getXMFZ().equals(other.getXMFZ()))
            && (this.getGSXM() == null ? other.getGSXM() == null : this.getGSXM().equals(other.getGSXM()))
            && (this.getKSRQ() == null ? other.getKSRQ() == null : this.getKSRQ().equals(other.getKSRQ()))
            && (this.getJZRQ() == null ? other.getJZRQ() == null : this.getJZRQ().equals(other.getJZRQ()))
            && (this.getXMZL() == null ? other.getXMZL() == null : this.getXMZL().equals(other.getXMZL()))
            && (this.getBZ() == null ? other.getBZ() == null : this.getBZ().equals(other.getBZ()))
            && (this.getYLXSJID() == null ? other.getYLXSJID() == null : this.getYLXSJID().equals(other.getYLXSJID()))
            && (this.getSHZT() == null ? other.getSHZT() == null : this.getSHZT().equals(other.getSHZT()))
            && (this.getZGLDID() == null ? other.getZGLDID() == null : this.getZGLDID().equals(other.getZGLDID()))
            && (this.getXGLDID() == null ? other.getXGLDID() == null : this.getXGLDID().equals(other.getXGLDID()))
            && (this.getCDYWZX() == null ? other.getCDYWZX() == null : this.getCDYWZX().equals(other.getCDYWZX()))
            && (this.getCDYWZXFZRID() == null ? other.getCDYWZXFZRID() == null : this.getCDYWZXFZRID().equals(other.getCDYWZXFZRID()))
            && (this.getCDBMFZRID() == null ? other.getCDBMFZRID() == null : this.getCDBMFZRID().equals(other.getCDBMFZRID()))
            && (this.getWCZT() == null ? other.getWCZT() == null : this.getWCZT().equals(other.getWCZT()))
            && (this.getBXZT() == null ? other.getBXZT() == null : this.getBXZT().equals(other.getBXZT()))
            && (this.getSFQC() == null ? other.getSFQC() == null : this.getSFQC().equals(other.getSFQC()))
            && (this.getCDSYBID() == null ? other.getCDSYBID() == null : this.getCDSYBID().equals(other.getCDSYBID()))
            && (this.getXMJD() == null ? other.getXMJD() == null : this.getXMJD().equals(other.getXMJD()))
            && (this.getXMZJF() == null ? other.getXMZJF() == null : this.getXMZJF().equals(other.getXMZJF()))
            && (this.getHBJF() == null ? other.getHBJF() == null : this.getHBJF().equals(other.getHBJF()))
            && (this.getHBJFBL() == null ? other.getHBJFBL() == null : this.getHBJFBL().equals(other.getHBJFBL()))
            && (this.getSYBFZRID() == null ? other.getSYBFZRID() == null : this.getSYBFZRID().equals(other.getSYBFZRID()))
            && (this.getYSTJ() == null ? other.getYSTJ() == null : this.getYSTJ().equals(other.getYSTJ()))
            && (this.getSFSD() == null ? other.getSFSD() == null : this.getSFSD().equals(other.getSFSD()))
            && (this.getSFYX() == null ? other.getSFYX() == null : this.getSFYX().equals(other.getSFYX()))
            && (this.getCJSJ() == null ? other.getCJSJ() == null : this.getCJSJ().equals(other.getCJSJ()))
            && (this.getCJRID() == null ? other.getCJRID() == null : this.getCJRID().equals(other.getCJRID()))
            && (this.getSFXZXM() == null ? other.getSFXZXM() == null : this.getSFXZXM().equals(other.getSFXZXM()))
            && (this.getPID() == null ? other.getPID() == null : this.getPID().equals(other.getPID()))
            && (this.getHTMC() == null ? other.getHTMC() == null : this.getHTMC().equals(other.getHTMC()))
            && (this.getHTID() == null ? other.getHTID() == null : this.getHTID().equals(other.getHTID()))
            && (this.getRWYQ() == null ? other.getRWYQ() == null : this.getRWYQ().equals(other.getRWYQ()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getXMBH() == null) ? 0 : getXMBH().hashCode());
        result = prime * result + ((getYLXMC() == null) ? 0 : getYLXMC().hashCode());
        result = prime * result + ((getXMJC() == null) ? 0 : getXMJC().hashCode());
        result = prime * result + ((getXMMC() == null) ? 0 : getXMMC().hashCode());
        result = prime * result + ((getYZDW() == null) ? 0 : getYZDW().hashCode());
        result = prime * result + ((getSQBMID() == null) ? 0 : getSQBMID().hashCode());
        result = prime * result + ((getCDBMID() == null) ? 0 : getCDBMID().hashCode());
        result = prime * result + ((getXMJLID() == null) ? 0 : getXMJLID().hashCode());
        result = prime * result + ((getXMZLID() == null) ? 0 : getXMZLID().hashCode());
        result = prime * result + ((getJSJLID() == null) ? 0 : getJSJLID().hashCode());
        result = prime * result + ((getJSZLID() == null) ? 0 : getJSZLID().hashCode());
        result = prime * result + ((getCSJMGDFWRWYQ() == null) ? 0 : getCSJMGDFWRWYQ().hashCode());
        result = prime * result + ((getXMLX() == null) ? 0 : getXMLX().hashCode());
        result = prime * result + ((getXMND() == null) ? 0 : getXMND().hashCode());
        result = prime * result + ((getHTBH() == null) ? 0 : getHTBH().hashCode());
        result = prime * result + ((getSSHY() == null) ? 0 : getSSHY().hashCode());
        result = prime * result + ((getXMZT() == null) ? 0 : getXMZT().hashCode());
        result = prime * result + ((getXDRQ() == null) ? 0 : getXDRQ().hashCode());
        result = prime * result + ((getXMFZ() == null) ? 0 : getXMFZ().hashCode());
        result = prime * result + ((getGSXM() == null) ? 0 : getGSXM().hashCode());
        result = prime * result + ((getKSRQ() == null) ? 0 : getKSRQ().hashCode());
        result = prime * result + ((getJZRQ() == null) ? 0 : getJZRQ().hashCode());
        result = prime * result + ((getXMZL() == null) ? 0 : getXMZL().hashCode());
        result = prime * result + ((getBZ() == null) ? 0 : getBZ().hashCode());
        result = prime * result + ((getYLXSJID() == null) ? 0 : getYLXSJID().hashCode());
        result = prime * result + ((getSHZT() == null) ? 0 : getSHZT().hashCode());
        result = prime * result + ((getZGLDID() == null) ? 0 : getZGLDID().hashCode());
        result = prime * result + ((getXGLDID() == null) ? 0 : getXGLDID().hashCode());
        result = prime * result + ((getCDYWZX() == null) ? 0 : getCDYWZX().hashCode());
        result = prime * result + ((getCDYWZXFZRID() == null) ? 0 : getCDYWZXFZRID().hashCode());
        result = prime * result + ((getCDBMFZRID() == null) ? 0 : getCDBMFZRID().hashCode());
        result = prime * result + ((getWCZT() == null) ? 0 : getWCZT().hashCode());
        result = prime * result + ((getBXZT() == null) ? 0 : getBXZT().hashCode());
        result = prime * result + ((getSFQC() == null) ? 0 : getSFQC().hashCode());
        result = prime * result + ((getCDSYBID() == null) ? 0 : getCDSYBID().hashCode());
        result = prime * result + ((getXMJD() == null) ? 0 : getXMJD().hashCode());
        result = prime * result + ((getXMZJF() == null) ? 0 : getXMZJF().hashCode());
        result = prime * result + ((getHBJF() == null) ? 0 : getHBJF().hashCode());
        result = prime * result + ((getHBJFBL() == null) ? 0 : getHBJFBL().hashCode());
        result = prime * result + ((getSYBFZRID() == null) ? 0 : getSYBFZRID().hashCode());
        result = prime * result + ((getYSTJ() == null) ? 0 : getYSTJ().hashCode());
        result = prime * result + ((getSFSD() == null) ? 0 : getSFSD().hashCode());
        result = prime * result + ((getSFYX() == null) ? 0 : getSFYX().hashCode());
        result = prime * result + ((getCJSJ() == null) ? 0 : getCJSJ().hashCode());
        result = prime * result + ((getCJRID() == null) ? 0 : getCJRID().hashCode());
        result = prime * result + ((getSFXZXM() == null) ? 0 : getSFXZXM().hashCode());
        result = prime * result + ((getPID() == null) ? 0 : getPID().hashCode());
        result = prime * result + ((getHTMC() == null) ? 0 : getHTMC().hashCode());
        result = prime * result + ((getHTID() == null) ? 0 : getHTID().hashCode());
        result = prime * result + ((getRWYQ() == null) ? 0 : getRWYQ().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", XMBH=").append(XMBH);
        sb.append(", YLXMC=").append(YLXMC);
        sb.append(", XMJC=").append(XMJC);
        sb.append(", XMMC=").append(XMMC);
        sb.append(", YZDW=").append(YZDW);
        sb.append(", SQBMID=").append(SQBMID);
        sb.append(", CDBMID=").append(CDBMID);
        sb.append(", XMJLID=").append(XMJLID);
        sb.append(", XMZLID=").append(XMZLID);
        sb.append(", JSJLID=").append(JSJLID);
        sb.append(", JSZLID=").append(JSZLID);
        sb.append(", CSJMGDFWRWYQ=").append(CSJMGDFWRWYQ);
        sb.append(", XMLX=").append(XMLX);
        sb.append(", XMND=").append(XMND);
        sb.append(", HTBH=").append(HTBH);
        sb.append(", SSHY=").append(SSHY);
        sb.append(", XMZT=").append(XMZT);
        sb.append(", XDRQ=").append(XDRQ);
        sb.append(", XMFZ=").append(XMFZ);
        sb.append(", GSXM=").append(GSXM);
        sb.append(", KSRQ=").append(KSRQ);
        sb.append(", JZRQ=").append(JZRQ);
        sb.append(", XMZL=").append(XMZL);
        sb.append(", BZ=").append(BZ);
        sb.append(", YLXSJID=").append(YLXSJID);
        sb.append(", SHZT=").append(SHZT);
        sb.append(", ZGLDID=").append(ZGLDID);
        sb.append(", XGLDID=").append(XGLDID);
        sb.append(", CDYWZX=").append(CDYWZX);
        sb.append(", CDYWZXFZRID=").append(CDYWZXFZRID);
        sb.append(", CDBMFZRID=").append(CDBMFZRID);
        sb.append(", WCZT=").append(WCZT);
        sb.append(", BXZT=").append(BXZT);
        sb.append(", SFQC=").append(SFQC);
        sb.append(", CDSYBID=").append(CDSYBID);
        sb.append(", XMJD=").append(XMJD);
        sb.append(", XMZJF=").append(XMZJF);
        sb.append(", HBJF=").append(HBJF);
        sb.append(", HBJFBL=").append(HBJFBL);
        sb.append(", SYBFZRID=").append(SYBFZRID);
        sb.append(", YSTJ=").append(YSTJ);
        sb.append(", SFSD=").append(SFSD);
        sb.append(", SFYX=").append(SFYX);
        sb.append(", CJSJ=").append(CJSJ);
        sb.append(", CJRID=").append(CJRID);
        sb.append(", SFXZXM=").append(SFXZXM);
        sb.append(", PID=").append(PID);
        sb.append(", HTMC=").append(HTMC);
        sb.append(", HTID=").append(HTID);
        sb.append(", RWYQ=").append(RWYQ);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}