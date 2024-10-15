package edu.icet.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class ItemEntity {
    private String itemCode;
    private String Description;
    private int qty;
    private double sellingPrice;
    private double buyingPrice;
    private String itemType;
    private String size;
    private String supplierId;


}
