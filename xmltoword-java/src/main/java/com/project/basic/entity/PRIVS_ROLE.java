package com.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class PRIVS_ROLE implements Serializable {
    private String ID;

    private String NAME;

    private String ALIASNAME;

    private String DESCRIPTION;

    private String NAMESPACE;

    private Integer INDEXOFORDER;

    private String ISSYSTEM;

    private String CJRID;

    private Date CJSJ;

    private String REALFUNARR;

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

    public String getNAMESPACE() {
        return NAMESPACE;
    }

    public void setNAMESPACE(String NAMESPACE) {
        this.NAMESPACE = NAMESPACE == null ? null : NAMESPACE.trim();
    }

    public Integer getINDEXOFORDER() {
        return INDEXOFORDER;
    }

    public void setINDEXOFORDER(Integer INDEXOFORDER) {
        this.INDEXOFORDER = INDEXOFORDER;
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

    public String getREALFUNARR() {
        return REALFUNARR;
    }

    public void setREALFUNARR(String REALFUNARR) {
        this.REALFUNARR = REALFUNARR == null ? null : REALFUNARR.trim();
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
        PRIVS_ROLE other = (PRIVS_ROLE) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getNAME() == null ? other.getNAME() == null : this.getNAME().equals(other.getNAME()))
            && (this.getALIASNAME() == null ? other.getALIASNAME() == null : this.getALIASNAME().equals(other.getALIASNAME()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()))
            && (this.getNAMESPACE() == null ? other.getNAMESPACE() == null : this.getNAMESPACE().equals(other.getNAMESPACE()))
            && (this.getINDEXOFORDER() == null ? other.getINDEXOFORDER() == null : this.getINDEXOFORDER().equals(other.getINDEXOFORDER()))
            && (this.getISSYSTEM() == null ? other.getISSYSTEM() == null : this.getISSYSTEM().equals(other.getISSYSTEM()))
            && (this.getCJRID() == null ? other.getCJRID() == null : this.getCJRID().equals(other.getCJRID()))
            && (this.getCJSJ() == null ? other.getCJSJ() == null : this.getCJSJ().equals(other.getCJSJ()))
            && (this.getREALFUNARR() == null ? other.getREALFUNARR() == null : this.getREALFUNARR().equals(other.getREALFUNARR()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getNAME() == null) ? 0 : getNAME().hashCode());
        result = prime * result + ((getALIASNAME() == null) ? 0 : getALIASNAME().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        result = prime * result + ((getNAMESPACE() == null) ? 0 : getNAMESPACE().hashCode());
        result = prime * result + ((getINDEXOFORDER() == null) ? 0 : getINDEXOFORDER().hashCode());
        result = prime * result + ((getISSYSTEM() == null) ? 0 : getISSYSTEM().hashCode());
        result = prime * result + ((getCJRID() == null) ? 0 : getCJRID().hashCode());
        result = prime * result + ((getCJSJ() == null) ? 0 : getCJSJ().hashCode());
        result = prime * result + ((getREALFUNARR() == null) ? 0 : getREALFUNARR().hashCode());
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
        sb.append(", NAMESPACE=").append(NAMESPACE);
        sb.append(", INDEXOFORDER=").append(INDEXOFORDER);
        sb.append(", ISSYSTEM=").append(ISSYSTEM);
        sb.append(", CJRID=").append(CJRID);
        sb.append(", CJSJ=").append(CJSJ);
        sb.append(", REALFUNARR=").append(REALFUNARR);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}