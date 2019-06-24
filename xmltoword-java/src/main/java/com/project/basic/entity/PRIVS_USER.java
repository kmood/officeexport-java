package com.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class PRIVS_USER implements Serializable {
    private String ID;

    private String DEPARTMENTID;

    private String NAME;

    private String REALNAME;

    private String IDCARD;

    private String SEX;

    private String USERCODE;

    private String MOBILE;

    private String QQ;

    private String EMAIL;

    private Date CAREERENTRY;

    private Date LEAVEDATE;

    private String LEADERID;

    private String POSITIONID;

    private String PASSWORD;

    private String TOKEN;

    private String ISSYSTEM;

    private String ISLOCKED;

    private String REMARK;

    private Integer INDEXOFORDER;

    private String BGWZ;

    private String BGDH;

    private String GN;

    private String CLIENTID;

    private String SFYXGMM;

    private String ZSBMID;

    private String WXBSM;

    private String CJRID;

    private Date CJSJ;

    private String NAMEPassword;

    private String PHOTOPATH;
    private String bm;


    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getDEPARTMENTID() {
        return DEPARTMENTID;
    }

    public void setDEPARTMENTID(String DEPARTMENTID) {
        this.DEPARTMENTID = DEPARTMENTID == null ? null : DEPARTMENTID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getREALNAME() {
        return REALNAME;
    }

    public void setREALNAME(String REALNAME) {
        this.REALNAME = REALNAME == null ? null : REALNAME.trim();
    }

    public String getIDCARD() {
        return IDCARD;
    }

    public void setIDCARD(String IDCARD) {
        this.IDCARD = IDCARD == null ? null : IDCARD.trim();
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX == null ? null : SEX.trim();
    }

    public String getUSERCODE() {
        return USERCODE;
    }

    public void setUSERCODE(String USERCODE) {
        this.USERCODE = USERCODE == null ? null : USERCODE.trim();
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE == null ? null : MOBILE.trim();
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public Date getCAREERENTRY() {
        return CAREERENTRY;
    }

    public void setCAREERENTRY(Date CAREERENTRY) {
        this.CAREERENTRY = CAREERENTRY;
    }

    public Date getLEAVEDATE() {
        return LEAVEDATE;
    }

    public void setLEAVEDATE(Date LEAVEDATE) {
        this.LEAVEDATE = LEAVEDATE;
    }

    public String getLEADERID() {
        return LEADERID;
    }

    public void setLEADERID(String LEADERID) {
        this.LEADERID = LEADERID == null ? null : LEADERID.trim();
    }

    public String getPOSITIONID() {
        return POSITIONID;
    }

    public void setPOSITIONID(String POSITIONID) {
        this.POSITIONID = POSITIONID == null ? null : POSITIONID.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN == null ? null : TOKEN.trim();
    }

    public String getISSYSTEM() {
        return ISSYSTEM;
    }

    public void setISSYSTEM(String ISSYSTEM) {
        this.ISSYSTEM = ISSYSTEM == null ? null : ISSYSTEM.trim();
    }

    public String getISLOCKED() {
        return ISLOCKED;
    }

    public void setISLOCKED(String ISLOCKED) {
        this.ISLOCKED = ISLOCKED == null ? null : ISLOCKED.trim();
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public Integer getINDEXOFORDER() {
        return INDEXOFORDER;
    }

    public void setINDEXOFORDER(Integer INDEXOFORDER) {
        this.INDEXOFORDER = INDEXOFORDER;
    }

    public String getBGWZ() {
        return BGWZ;
    }

    public void setBGWZ(String BGWZ) {
        this.BGWZ = BGWZ == null ? null : BGWZ.trim();
    }

    public String getBGDH() {
        return BGDH;
    }

    public void setBGDH(String BGDH) {
        this.BGDH = BGDH == null ? null : BGDH.trim();
    }

    public String getGN() {
        return GN;
    }

    public void setGN(String GN) {
        this.GN = GN == null ? null : GN.trim();
    }

    public String getCLIENTID() {
        return CLIENTID;
    }

    public void setCLIENTID(String CLIENTID) {
        this.CLIENTID = CLIENTID == null ? null : CLIENTID.trim();
    }

    public String getSFYXGMM() {
        return SFYXGMM;
    }

    public void setSFYXGMM(String SFYXGMM) {
        this.SFYXGMM = SFYXGMM == null ? null : SFYXGMM.trim();
    }

    public String getZSBMID() {
        return ZSBMID;
    }

    public void setZSBMID(String ZSBMID) {
        this.ZSBMID = ZSBMID == null ? null : ZSBMID.trim();
    }

    public String getWXBSM() {
        return WXBSM;
    }

    public void setWXBSM(String WXBSM) {
        this.WXBSM = WXBSM == null ? null : WXBSM.trim();
    }

    public String getCJRID() {
        return CJRID;
    }

    public void setCJRID(String CJRID) {
        this.CJRID = CJRID == null ? null : CJRID.trim();
    }

    public Date getCJSJ() {
        return CJSJ;
    }

    public void setCJSJ(Date CJSJ) {
        this.CJSJ = CJSJ;
    }

    public String getNAMEPassword() {
        return NAMEPassword;
    }

    public void setNAMEPassword(String NAMEPassword) {
        this.NAMEPassword = NAMEPassword == null ? null : NAMEPassword.trim();
    }

    public String getPHOTOPATH() {
        return PHOTOPATH;
    }

    public void setPHOTOPATH(String PHOTOPATH) {
        this.PHOTOPATH = PHOTOPATH == null ? null : PHOTOPATH.trim();
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
        PRIVS_USER other = (PRIVS_USER) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPARTMENTID() == null ? other.getDEPARTMENTID() == null : this.getDEPARTMENTID().equals(other.getDEPARTMENTID()))
            && (this.getNAME() == null ? other.getNAME() == null : this.getNAME().equals(other.getNAME()))
            && (this.getREALNAME() == null ? other.getREALNAME() == null : this.getREALNAME().equals(other.getREALNAME()))
            && (this.getIDCARD() == null ? other.getIDCARD() == null : this.getIDCARD().equals(other.getIDCARD()))
            && (this.getSEX() == null ? other.getSEX() == null : this.getSEX().equals(other.getSEX()))
            && (this.getUSERCODE() == null ? other.getUSERCODE() == null : this.getUSERCODE().equals(other.getUSERCODE()))
            && (this.getMOBILE() == null ? other.getMOBILE() == null : this.getMOBILE().equals(other.getMOBILE()))
            && (this.getQQ() == null ? other.getQQ() == null : this.getQQ().equals(other.getQQ()))
            && (this.getEMAIL() == null ? other.getEMAIL() == null : this.getEMAIL().equals(other.getEMAIL()))
            && (this.getCAREERENTRY() == null ? other.getCAREERENTRY() == null : this.getCAREERENTRY().equals(other.getCAREERENTRY()))
            && (this.getLEAVEDATE() == null ? other.getLEAVEDATE() == null : this.getLEAVEDATE().equals(other.getLEAVEDATE()))
            && (this.getLEADERID() == null ? other.getLEADERID() == null : this.getLEADERID().equals(other.getLEADERID()))
            && (this.getPOSITIONID() == null ? other.getPOSITIONID() == null : this.getPOSITIONID().equals(other.getPOSITIONID()))
            && (this.getPASSWORD() == null ? other.getPASSWORD() == null : this.getPASSWORD().equals(other.getPASSWORD()))
            && (this.getTOKEN() == null ? other.getTOKEN() == null : this.getTOKEN().equals(other.getTOKEN()))
            && (this.getISSYSTEM() == null ? other.getISSYSTEM() == null : this.getISSYSTEM().equals(other.getISSYSTEM()))
            && (this.getISLOCKED() == null ? other.getISLOCKED() == null : this.getISLOCKED().equals(other.getISLOCKED()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getINDEXOFORDER() == null ? other.getINDEXOFORDER() == null : this.getINDEXOFORDER().equals(other.getINDEXOFORDER()))
            && (this.getBGWZ() == null ? other.getBGWZ() == null : this.getBGWZ().equals(other.getBGWZ()))
            && (this.getBGDH() == null ? other.getBGDH() == null : this.getBGDH().equals(other.getBGDH()))
            && (this.getGN() == null ? other.getGN() == null : this.getGN().equals(other.getGN()))
            && (this.getCLIENTID() == null ? other.getCLIENTID() == null : this.getCLIENTID().equals(other.getCLIENTID()))
            && (this.getSFYXGMM() == null ? other.getSFYXGMM() == null : this.getSFYXGMM().equals(other.getSFYXGMM()))
            && (this.getZSBMID() == null ? other.getZSBMID() == null : this.getZSBMID().equals(other.getZSBMID()))
            && (this.getWXBSM() == null ? other.getWXBSM() == null : this.getWXBSM().equals(other.getWXBSM()))
            && (this.getCJRID() == null ? other.getCJRID() == null : this.getCJRID().equals(other.getCJRID()))
            && (this.getCJSJ() == null ? other.getCJSJ() == null : this.getCJSJ().equals(other.getCJSJ()))
            && (this.getNAMEPassword() == null ? other.getNAMEPassword() == null : this.getNAMEPassword().equals(other.getNAMEPassword()))
            && (this.getPHOTOPATH() == null ? other.getPHOTOPATH() == null : this.getPHOTOPATH().equals(other.getPHOTOPATH()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getDEPARTMENTID() == null) ? 0 : getDEPARTMENTID().hashCode());
        result = prime * result + ((getNAME() == null) ? 0 : getNAME().hashCode());
        result = prime * result + ((getREALNAME() == null) ? 0 : getREALNAME().hashCode());
        result = prime * result + ((getIDCARD() == null) ? 0 : getIDCARD().hashCode());
        result = prime * result + ((getSEX() == null) ? 0 : getSEX().hashCode());
        result = prime * result + ((getUSERCODE() == null) ? 0 : getUSERCODE().hashCode());
        result = prime * result + ((getMOBILE() == null) ? 0 : getMOBILE().hashCode());
        result = prime * result + ((getQQ() == null) ? 0 : getQQ().hashCode());
        result = prime * result + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        result = prime * result + ((getCAREERENTRY() == null) ? 0 : getCAREERENTRY().hashCode());
        result = prime * result + ((getLEAVEDATE() == null) ? 0 : getLEAVEDATE().hashCode());
        result = prime * result + ((getLEADERID() == null) ? 0 : getLEADERID().hashCode());
        result = prime * result + ((getPOSITIONID() == null) ? 0 : getPOSITIONID().hashCode());
        result = prime * result + ((getPASSWORD() == null) ? 0 : getPASSWORD().hashCode());
        result = prime * result + ((getTOKEN() == null) ? 0 : getTOKEN().hashCode());
        result = prime * result + ((getISSYSTEM() == null) ? 0 : getISSYSTEM().hashCode());
        result = prime * result + ((getISLOCKED() == null) ? 0 : getISLOCKED().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getINDEXOFORDER() == null) ? 0 : getINDEXOFORDER().hashCode());
        result = prime * result + ((getBGWZ() == null) ? 0 : getBGWZ().hashCode());
        result = prime * result + ((getBGDH() == null) ? 0 : getBGDH().hashCode());
        result = prime * result + ((getGN() == null) ? 0 : getGN().hashCode());
        result = prime * result + ((getCLIENTID() == null) ? 0 : getCLIENTID().hashCode());
        result = prime * result + ((getSFYXGMM() == null) ? 0 : getSFYXGMM().hashCode());
        result = prime * result + ((getZSBMID() == null) ? 0 : getZSBMID().hashCode());
        result = prime * result + ((getWXBSM() == null) ? 0 : getWXBSM().hashCode());
        result = prime * result + ((getCJRID() == null) ? 0 : getCJRID().hashCode());
        result = prime * result + ((getCJSJ() == null) ? 0 : getCJSJ().hashCode());
        result = prime * result + ((getNAMEPassword() == null) ? 0 : getNAMEPassword().hashCode());
        result = prime * result + ((getPHOTOPATH() == null) ? 0 : getPHOTOPATH().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", DEPARTMENTID=").append(DEPARTMENTID);
        sb.append(", NAME=").append(NAME);
        sb.append(", REALNAME=").append(REALNAME);
        sb.append(", IDCARD=").append(IDCARD);
        sb.append(", SEX=").append(SEX);
        sb.append(", USERCODE=").append(USERCODE);
        sb.append(", MOBILE=").append(MOBILE);
        sb.append(", QQ=").append(QQ);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", CAREERENTRY=").append(CAREERENTRY);
        sb.append(", LEAVEDATE=").append(LEAVEDATE);
        sb.append(", LEADERID=").append(LEADERID);
        sb.append(", POSITIONID=").append(POSITIONID);
        sb.append(", PASSWORD=").append(PASSWORD);
        sb.append(", TOKEN=").append(TOKEN);
        sb.append(", ISSYSTEM=").append(ISSYSTEM);
        sb.append(", ISLOCKED=").append(ISLOCKED);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", INDEXOFORDER=").append(INDEXOFORDER);
        sb.append(", BGWZ=").append(BGWZ);
        sb.append(", BGDH=").append(BGDH);
        sb.append(", GN=").append(GN);
        sb.append(", CLIENTID=").append(CLIENTID);
        sb.append(", SFYXGMM=").append(SFYXGMM);
        sb.append(", ZSBMID=").append(ZSBMID);
        sb.append(", WXBSM=").append(WXBSM);
        sb.append(", CJRID=").append(CJRID);
        sb.append(", CJSJ=").append(CJSJ);
        sb.append(", NAMEPassword=").append(NAMEPassword);
        sb.append(", PHOTOPATH=").append(PHOTOPATH);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }
}