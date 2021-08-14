package com.enterprises.mengal.biltysystem.dto.bilty;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

public class CreateBiltyDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biltyId;
    private String msNo;

    private long fromId;
    private long toId;
    private long senderId;
    private long materialId;
    private long statusId;

    private String poNo;
    private String containerNo;
    private String vehicleNo;

    private float weight;
    private int dieselAmount;
    private int advanceAmount;
    private String driverName;
    private String driverMobileNo;
    private LocalDate date;



    public long getBiltyId() {
        return biltyId;
    }

    public void setBiltyId(long biltyId) {
        this.biltyId = biltyId;
    }

    public String getMsNo() {
        return msNo;
    }

    public void setMsNo(String msNo) {
        this.msNo = msNo;
    }

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public long getToId() {
        return toId;
    }

    public void setToId(long toId) {
        this.toId = toId;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
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

    public void setDieselAmount(int dieselAmount) {
        this.dieselAmount = dieselAmount;
    }

    public int getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(int advanceAmount) {
        this.advanceAmount = advanceAmount;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
