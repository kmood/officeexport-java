package com.project.basic.entity;

import java.io.Serializable;

public class PRIVS_USER_ROLE implements Serializable {
    private String USERID;

    private String ROLEID;

    private static final long serialVersionUID = 1L;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID == null ? null : USERID.trim();
    }

    public String getROLEID() {
        return ROLEID;
    }

    public void setROLEID(String ROLEID) {
        this.ROLEID = ROLEID == null ? null : ROLEID.trim();
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
        PRIVS_USER_ROLE other = (PRIVS_USER_ROLE) that;
        return (this.getUSERID() == null ? other.getUSERID() == null : this.getUSERID().equals(other.getUSERID()))
            && (this.getROLEID() == null ? other.getROLEID() == null : this.getROLEID().equals(other.getROLEID()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUSERID() == null) ? 0 : getUSERID().hashCode());
        result = prime * result + ((getROLEID() == null) ? 0 : getROLEID().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USERID=").append(USERID);
        sb.append(", ROLEID=").append(ROLEID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}