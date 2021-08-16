package com.enterprises.mengal.biltysystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Data
public class BiltyXlsx {

    @Id
    @GeneratedValue
    private long BiltyXlsxId;
    private long biltyId;
    private long paymentFileId;

    private String vehicleNo;
    private float weight;
    private LocalDate date;

    public long getBiltyId() {
        return biltyId;
    }
}
