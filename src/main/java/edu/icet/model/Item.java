package edu.icet.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Item {
    private String itemCode;
    private String Description;
    private int qty;
    private double sellingPrice;
    private double buyingPrice;
    private String itemType;
    private String size;
    private String supplierId;


}
