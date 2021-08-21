package com.enterprises.mengal.biltysystem.dto.bilty;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PaymentEntryDTO {
    private String vehicleNo;
    private float weight;
    private LocalDate date;
}

