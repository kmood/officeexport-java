package com.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class PRIVS_LEADER implements Serializable {
    private String ID;

    private String DEPARTMENTID;

    private String USERID;

    private String ROLENAME;

    private String POSITION;

    private String RESPONSIBILITY;

    private String REMARK;

    private String LEADERLEVEL;

    private String ISSINGLE;

    private String DESCRIPTION;

    private String ISSYSTEM;

    private String CJRID;

    private Date CJSJ;

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

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getROLENAME() {
        return ROLENAME;
    }

    public void setROLENAME(String ROLENAME) {
        this.ROLENAME = ROLENAME == null ? null : ROLENAME.trim();
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION == null ? null : POSITION.trim();
    }

    public String getRESPONSIBILITY() {
        return RESPONSIBILITY;
    }

    public void setRESPONSIBILITY(String RESPONSIBILITY) {
        this.RESPONSIBILITY = RESPONSIBILITY == null ? null : RESPONSIBILITY.trim();
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public String getLEADERLEVEL() {
        return LEADERLEVEL;
    }

    public void setLEADERLEVEL(String LEADERLEVEL) {
        this.LEADERLEVEL = LEADERLEVEL == null ? null : LEADERLEVEL.trim();
    }

    public String getISSINGLE() {
        return ISSINGLE;
    }

    public void setISSINGLE(String ISSINGLE) {
        this.ISSINGLE = ISSINGLE == null ? null : ISSINGLE.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
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
        PRIVS_LEADER other = (PRIVS_LEADER) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPARTMENTID() == null ? other.getDEPARTMENTID() == null : this.getDEPARTMENTID().equals(other.getDEPARTMENTID()))
            && (this.getUSERID() == null ? other.getUSERID() == null : this.getUSERID().equals(other.getUSERID()))
            && (this.getROLENAME() == null ? other.getROLENAME() == null : this.getROLENAME().equals(other.getROLENAME()))
            && (this.getPOSITION() == null ? other.getPOSITION() == null : this.getPOSITION().equals(other.getPOSITION()))
            && (this.getRESPONSIBILITY() == null ? other.getRESPONSIBILITY() == null : this.getRESPONSIBILITY().equals(other.getRESPONSIBILITY()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getLEADERLEVEL() == null ? other.getLEADERLEVEL() == null : this.getLEADERLEVEL().equals(other.getLEADERLEVEL()))
            && (this.getISSINGLE() == null ? other.getISSINGLE() == null : this.getISSINGLE().equals(other.getISSINGLE()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
            && (this.getISSYSTEM() == null ? other.getISSYSTEM() == null : this.getISSYSTEM().equals(other.getISSYSTEM()))
            && (this.getCJRID() == null ? other.getCJRID() == null : this.getCJRID().equals(other.getCJRID()))
            && (this.getCJSJ() == null ? other.getCJSJ() == null : this.getCJSJ().equals(other.getCJSJ()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getDEPARTMENTID() == null) ? 0 : getDEPARTMENTID().hashCode());
        result = prime * result + ((getUSERID() == null) ? 0 : getUSERID().hashCode());
        result = prime * result + ((getROLENAME() == null) ? 0 : getROLENAME().hashCode());
        result = prime * result + ((getPOSITION() == null) ? 0 : getPOSITION().hashCode());
        result = prime * result + ((getRESPONSIBILITY() == null) ? 0 : getRESPONSIBILITY().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getLEADERLEVEL() == null) ? 0 : getLEADERLEVEL().hashCode());
        result = prime * result + ((getISSINGLE() == null) ? 0 : getISSINGLE().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getISSYSTEM() == null) ? 0 : getISSYSTEM().hashCode());
        result = prime * result + ((getCJRID() == null) ? 0 : getCJRID().hashCode());
        result = prime * result + ((getCJSJ() == null) ? 0 : getCJSJ().hashCode());
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
        sb.append(", USERID=").append(USERID);
        sb.append(", ROLENAME=").append(ROLENAME);
        sb.append(", POSITION=").append(POSITION);
        sb.append(", RESPONSIBILITY=").append(RESPONSIBILITY);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", LEADERLEVEL=").append(LEADERLEVEL);
        sb.append(", ISSINGLE=").append(ISSINGLE);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", ISSYSTEM=").append(ISSYSTEM);
        sb.append(", CJRID=").append(CJRID);
        sb.append(", CJSJ=").append(CJSJ);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}