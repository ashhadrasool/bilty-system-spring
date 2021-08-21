package com.enterprises.mengal.biltysystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
public class PaymentEntry {

    @Id
    @GeneratedValue
    private Long paymentEntryId;
    private Integer paymentEntryFileIndex;
    @ManyToOne
    @JoinColumn(name="biltyId", referencedColumnName="biltyId")
    private Bilty bilty;

    private Long paymentFileId;

    private String vehicleNo;
    private float weight;
    private LocalDate date;

}
