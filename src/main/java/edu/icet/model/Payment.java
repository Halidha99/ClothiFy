package edu.icet.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Payment {
    private  String paymentId;
    private String date;
    private double payment;
    private double balance;
    private  String orderId;

}
