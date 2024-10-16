package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaymentEntity {
    private  String paymentId;
    private String date;
    private double payment;
    private double balance;
    private  String orderId;

}
