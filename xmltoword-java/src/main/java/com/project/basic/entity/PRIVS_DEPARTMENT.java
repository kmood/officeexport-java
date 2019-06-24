package com.project.basic.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PRIVS_DEPARTMENT implements Serializable {
    private String ID;

    private String NAME;

    private String ALIASNAME;

    private String DESCRIPTION;

    private String PARENTID;

    private String DUTY;

    private Date CREATEDATE;

    private String ADDRESS;

    private String URL;

    private String CONTACTS;

    private String TELEPHONE;

    private String EMAIL;

    private String DEPARTMENTCODE;

    private Integer INDEXOFORDER;

    private BigDecimal x;

    private BigDecimal y;

    private Date CXRQ;

    private String ISDEPARTMENT;

    private String REMARK;

    private String ISSYSTEM;

    private String CJRID;

    private Date CJSJ;

    private String XZQBM;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getALIASNAME() {
        return ALIASNAME;
    }

    public void setALIASNAME(String ALIASNAME) {
        this.ALIASNAME = ALIASNAME == null ? null : ALIASNAME.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID == null ? null : PARENTID.trim();
    }

    public String getDUTY() {
        return DUTY;
    }

    public void setDUTY(String DUTY) {
        this.DUTY = DUTY == null ? null : DUTY.trim();
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL == null ? null : URL.trim();
    }

    public String getCONTACTS() {
        return CONTACTS;
    }

    public void setCONTACTS(String CONTACTS) {
        this.CONTACTS = CONTACTS == null ? null : CONTACTS.trim();
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE == null ? null : TELEPHONE.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public String getDEPARTMENTCODE() {
        return DEPARTMENTCODE;
    }

    public void setDEPARTMENTCODE(String DEPARTMENTCODE) {
        this.DEPARTMENTCODE = DEPARTMENTCODE == null ? null : DEPARTMENTCODE.trim();
    }

    public Integer getINDEXOFORDER() {
        return INDEXOFORDER;
    }

    public void setINDEXOFORDER(Integer INDEXOFORDER) {
        this.INDEXOFORDER = INDEXOFORDER;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public Date getCXRQ() {
        return CXRQ;
    }

    public void setCXRQ(Date CXRQ) {
        this.CXRQ = CXRQ;
    }

    public String getISDEPARTMENT() {
        return ISDEPARTMENT;
    }

    public void setISDEPARTMENT(String ISDEPARTMENT) {
        this.ISDEPARTMENT = ISDEPARTMENT == null ? null : ISDEPARTMENT.trim();
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public String getISSYSTEM() {
        return ISSYSTEM;
    }

    public void setISSYSTEM(String ISSYSTEM) {
        this.ISSYSTEM = ISSYSTEM == null ? null : ISSYSTEM.trim();
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

    public String getXZQBM() {
        return XZQBM;
    }

    public void setXZQBM(String XZQBM) {
        this.XZQBM = XZQBM == null ? null : XZQBM.trim();
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
        PRIVS_DEPARTMENT other = (PRIVS_DEPARTMENT) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getNAME() == null ? other.getNAME() == null : this.getNAME().equals(other.getNAME()))
            && (this.getALIASNAME() == null ? other.getALIASNAME() == null : this.getALIASNAME().equals(other.getALIASNAME()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
            && (this.getPARENTID() == null ? other.getPARENTID() == null : this.getPARENTID().equals(other.getPARENTID()))
            && (this.getDUTY() == null ? other.getDUTY() == null : this.getDUTY().equals(other.getDUTY()))
            && (this.getCREATEDATE() == null ? other.getCREATEDATE() == null : this.getCREATEDATE().equals(other.getCREATEDATE()))
            && (this.getADDRESS() == null ? other.getADDRESS() == null : this.getADDRESS().equals(other.getADDRESS()))
            && (this.getURL() == null ? other.getURL() == null : this.getURL().equals(other.getURL()))
            && (this.getCONTACTS() == null ? other.getCONTACTS() == null : this.getCONTACTS().equals(other.getCONTACTS()))
            && (this.getTELEPHONE() == null ? other.getTELEPHONE() == null : this.getTELEPHONE().equals(other.getTELEPHONE()))
            && (this.getEMAIL() == null ? other.getEMAIL() == null : this.getEMAIL().equals(other.getEMAIL()))
            && (this.getDEPARTMENTCODE() == null ? other.getDEPARTMENTCODE() == null : this.getDEPARTMENTCODE().equals(other.getDEPARTMENTCODE()))
            && (this.getINDEXOFORDER() == null ? other.getINDEXOFORDER() == null : this.getINDEXOFORDER().equals(other.getINDEXOFORDER()))
            && (this.getX() == null ? other.getX() == null : this.getX().equals(other.getX()))
            && (this.getY() == null ? other.getY() == null : this.getY().equals(other.getY()))
            && (this.getCXRQ() == null ? other.getCXRQ() == null : this.getCXRQ().equals(other.getCXRQ()))
            && (this.getISDEPARTMENT() == null ? other.getISDEPARTMENT() == null : this.getISDEPARTMENT().equals(other.getISDEPARTMENT()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getISSYSTEM() == null ? other.getISSYSTEM() == null : this.getISSYSTEM().equals(other.getISSYSTEM()))
            && (this.getCJRID() == null ? other.getCJRID() == null : this.getCJRID().equals(other.getCJRID()))
            && (this.getCJSJ() == null ? other.getCJSJ() == null : this.getCJSJ().equals(other.getCJSJ()))
            && (this.getXZQBM() == null ? other.getXZQBM() == null : this.getXZQBM().equals(other.getXZQBM()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getNAME() == null) ? 0 : getNAME().hashCode());
        result = prime * result + ((getALIASNAME() == null) ? 0 : getALIASNAME().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getPARENTID() == null) ? 0 : getPARENTID().hashCode());
        result = prime * result + ((getDUTY() == null) ? 0 : getDUTY().hashCode());
        result = prime * result + ((getCREATEDATE() == null) ? 0 : getCREATEDATE().hashCode());
        result = prime * result + ((getADDRESS() == null) ? 0 : getADDRESS().hashCode());
        result = prime * result + ((getURL() == null) ? 0 : getURL().hashCode());
        result = prime * result + ((getCONTACTS() == null) ? 0 : getCONTACTS().hashCode());
        result = prime * result + ((getTELEPHONE() == null) ? 0 : getTELEPHONE().hashCode());
        result = prime * result + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        result = prime * result + ((getDEPARTMENTCODE() == null) ? 0 : getDEPARTMENTCODE().hashCode());
        result = prime * result + ((getINDEXOFORDER() == null) ? 0 : getINDEXOFORDER().hashCode());
        result = prime * result + ((getX() == null) ? 0 : getX().hashCode());
        result = prime * result + ((getY() == null) ? 0 : getY().hashCode());
        result = prime * result + ((getCXRQ() == null) ? 0 : getCXRQ().hashCode());
        result = prime * result + ((getISDEPARTMENT() == null) ? 0 : getISDEPARTMENT().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getISSYSTEM() == null) ? 0 : getISSYSTEM().hashCode());
        result = prime * result + ((getCJRID() == null) ? 0 : getCJRID().hashCode());
        result = prime * result + ((getCJSJ() == null) ? 0 : getCJSJ().hashCode());
        result = prime * result + ((getXZQBM() == null) ? 0 : getXZQBM().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", ALIASNAME=").append(ALIASNAME);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", PARENTID=").append(PARENTID);
        sb.append(", DUTY=").append(DUTY);
        sb.append(", CREATEDATE=").append(CREATEDATE);
        sb.append(", ADDRESS=").append(ADDRESS);
        sb.append(", URL=").append(URL);
        sb.append(", CONTACTS=").append(CONTACTS);
        sb.append(", TELEPHONE=").append(TELEPHONE);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", DEPARTMENTCODE=").append(DEPARTMENTCODE);
        sb.append(", INDEXOFORDER=").append(INDEXOFORDER);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", CXRQ=").append(CXRQ);
        sb.append(", ISDEPARTMENT=").append(ISDEPARTMENT);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", ISSYSTEM=").append(ISSYSTEM);
        sb.append(", CJRID=").append(CJRID);
        sb.append(", CJSJ=").append(CJSJ);
        sb.append(", XZQBM=").append(XZQBM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}