package com.enterprises.mengal.biltysystem.dto.bilty;

import com.enterprises.mengal.biltysystem.model.Bilty;
import com.enterprises.mengal.biltysystem.model.Code;

import javax.persistence.*;
import java.util.Date;

public class CreateBiltyDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biltyid;
    private String msno;

    private long fromid;
    private long toid;
    private long senderid;
    private long materialid;
    private long statusid;

    private String pono;
    private String containerno;
    private String vehicleno;

    private float weight;
    private int dieselamount;
    private int advanceamount;
    private String drivername;
    private String drivermobileno;
    private boolean verified;
    private Date date;

    public long getBiltyid() {
        return biltyid;
    }

    public void setBiltyid(long biltyid) {
        this.biltyid = biltyid;
    }

    public String getMsno() {
        return msno;
    }

    public void setMsno(String msno) {
        this.msno = msno;
    }

    public long getFromid() {
        return fromid;
    }

    public void setFromid(long fromid) {
        this.fromid = fromid;
    }

    public long getToid() {
        return toid;
    }

    public void setToid(long toid) {
        this.toid = toid;
    }

    public long getSenderid() {
        return senderid;
    }

    public void setSenderid(long senderid) {
        this.senderid = senderid;
    }

    public long getMaterialid() {
        return materialid;
    }

    public void setMaterialid(long materialid) {
        this.materialid = materialid;
    }

    public long getStatusid() {
        return statusid;
    }

    public void setStatusid(long statusid) {
        this.statusid = statusid;
    }

    public String getPono() {
        return pono;
    }

    public void setPono(String pono) {
        this.pono = pono;
    }

    public String getContainerno() {
        return containerno;
    }

    public void setContainerno(String containerno) {
        this.containerno = containerno;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDieselamount() {
        return dieselamount;
    }

    public void setDieselamount(int dieselamount) {
        this.dieselamount = dieselamount;
    }

    public int getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(int advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getDrivermobileno() {
        return drivermobileno;
    }

    public void setDrivermobileno(String drivermobileno) {
        this.drivermobileno = drivermobileno;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
