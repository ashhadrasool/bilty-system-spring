package com.enterprises.mengal.biltysystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bilty extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biltyid;
    private String msno;

    @OneToOne
    @PrimaryKeyJoinColumn(name="from_id", referencedColumnName="code_id")
    private Code fromCode;
    @OneToOne
    @PrimaryKeyJoinColumn(name="to_id", referencedColumnName="code_id")
    private Code toCode;
    @OneToOne
    @PrimaryKeyJoinColumn(name="sender_id", referencedColumnName="code_id")
    private Code senderCode;
    @OneToOne
    @PrimaryKeyJoinColumn(name="material_id", referencedColumnName="code_id")
    private Code materialCode;
    private String pono;
    private String containerno;
    private String vehicleno;

    private float weight;
    private int dieselamount;
    private int advanceamount;
    private String drivername;
    private String drivermobileno;
    private long statusCode;
    private boolean verified;
    private Date date;

    public long getId() {
        return biltyid;
    }

    public static void setId(Bilty bilty, long biltyid) {
        bilty.biltyid = biltyid;
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

    public int getDieselamount() {
        return dieselamount;
    }

    public void setStatusid(long statusid) {
        this.statusCode = statusid;
    }

    public long getStatusid() {
        return statusCode;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void setDieselamount(int dieselamount) {
        this.dieselamount = dieselamount;
    }

    public String getMsno() {
        return msno;
    }
    public void setMsno(String msno) {
        this.msno = msno;
    }

    public Code getFrom() {
        return fromCode;
    }
    public void setFrom(Code from) {
        this.fromCode = from;
    }

    public Code getTo() {
        return toCode;
    }
    public void setTo(Code to) {
        this.toCode = to;
    }

    public Code getSender() {
        return senderCode;
    }
    public void setSender(Code sender) {
        this.senderCode = sender;
    }
    public Code getMaterialCode() {
        return materialCode;
    }
    public void setMaterialCode(Code materialCode) {
        this.materialCode = materialCode;
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

    public int getDieselAmount() {
        return dieselamount;
    }
    public void setDiesel(int dieselamount) {
        this.dieselamount = dieselamount;
    }

    public int getAdvanceamount() {
        return advanceamount;
    }
    public void setAdvanceamount(int advanceamount) {
        this.advanceamount = advanceamount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
