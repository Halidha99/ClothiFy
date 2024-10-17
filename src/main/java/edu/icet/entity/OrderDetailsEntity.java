package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailsEntity {
    private String orderId;
    private  String itemCode;
    private  int qty;
    private  double unitPrice;
    private  double totalPrice;
    private  double discount;



}
