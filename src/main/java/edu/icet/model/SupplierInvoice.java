package edu.icet.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SupplierInvoice {
    private String billId;
    private String supplierId;
    private String itemCode;
    private String date;
    private int qty;
}
