package com.enterprises.mengal.biltysystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bilty extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biltyId;
    private String msNo;

    @ManyToOne
    @JoinColumn(name="fromId", referencedColumnName="codeId")
    private Code fromCode;
    @ManyToOne
    @JoinColumn(name="toId", referencedColumnName="codeId")
    private Code toCode;
    @ManyToOne
    @JoinColumn(name="senderId", referencedColumnName="codeId")
    private Code senderCode;
    @ManyToOne
    @JoinColumn(name="materialId", referencedColumnName="codeId")
    private Code materialCode;
    @ManyToOne
    @JoinColumn(name="statusId", referencedColumnName="codeId")
    private Code statusCode;
    private String poNo;
    private String containerNo;
    private String vehicleNo;

    private float weight;
    private int dieselAmount;
    private int advanceAmount;
    private String driverName;
    private String driverMobileNo;

    private Date date;

    public long getId() {
        return biltyId;
    }

    public static void setId(Bilty bilty, long biltyid) {
        bilty.biltyId = biltyid;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverMobileNo() {
        return driverMobileNo;
    }

    public void setDriverMobileNo(String driverMobileNo) {
        this.driverMobileNo = driverMobileNo;
    }

    public void setStatus(Code status) {
        this.statusCode = status;
    }

    public Code getStatus() {
        return statusCode;
    }

    public String getMsNo() {
        return msNo;
    }
    public void setMsNo(String msNo) {
        this.msNo = msNo;
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

    public Code getMaterial() {
        return materialCode;
    }
    public void setMaterial(Code materialCode) {
        this.materialCode = materialCode;
    }

    public String getPoNo() {
        return poNo;
    }
    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getContainerNo() {
        return containerNo;
    }
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDieselAmount() {
        return dieselAmount;
    }
    public void setDieselAmount(int dieselamount) {
        this.dieselAmount = dieselamount;
    }

    public int getAdvanceAmount() {
        return advanceAmount;
    }
    public void setAdvanceAmount(int advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
