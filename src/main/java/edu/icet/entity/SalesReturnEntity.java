package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SalesReturnEntity {
    private String returnItemId;
    private String itemCode;
    private int qty;
    private double discount;
    private double unitPrice;
    private double amount;
}
