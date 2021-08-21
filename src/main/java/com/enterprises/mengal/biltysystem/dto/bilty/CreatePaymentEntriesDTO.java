package com.enterprises.mengal.biltysystem.dto.bilty;

import lombok.Data;

import java.util.List;

@Data
public class CreatePaymentEntriesDTO {
    Long paymentFileId;
    List<PaymentEntryDTO> paymentEntryList;
}
