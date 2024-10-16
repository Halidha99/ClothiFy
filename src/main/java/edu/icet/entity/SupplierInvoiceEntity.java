package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SupplierInvoiceEntity {
    private String billId;
    private String supplierId;
    private String itemCode;
    private String date;
    private int qty;
}
