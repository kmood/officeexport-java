package com.project.basic.entity;

import java.io.Serializable;
import java.util.Date;

public class FjModul implements Serializable {
    public FjModul (){
        System.out.println("容器启动1");
    }
    private String ID;

    private String PID;

    private String LJ;

    private String name;

    private Integer FWL;

    private Integer RD;

    private String SLTLJ;

    private Date RKSJ;

    private String WJGS;

    private String WJFL;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getLJ() {
        return LJ;
    }

    public void setLJ(String LJ) {
        this.LJ = LJ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFWL() {
        return FWL;
    }

    public void setFWL(Integer FWL) {
        this.FWL = FWL;
    }

    public Integer getRD() {
        return RD;
    }

    public void setRD(Integer RD) {
        this.RD = RD;
    }

    public String getSLTLJ() {
        return SLTLJ;
    }

    public void setSLTLJ(String SLTLJ) {
        this.SLTLJ = SLTLJ;
    }

    public Date getRKSJ() {
        return RKSJ;
    }

    public void setRKSJ(Date RKSJ) {
        this.RKSJ = RKSJ;
    }

    public String getWJGS() {
        return WJGS;
    }

    public void setWJGS(String WJGS) {
        this.WJGS = WJGS;
    }

    public String getWJFL() {
        return WJFL;
    }

    public void setWJFL(String WJFL) {
        this.WJFL = WJFL;
    }
}