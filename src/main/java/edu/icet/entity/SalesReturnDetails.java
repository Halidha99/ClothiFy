package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SalesReturnDetails {
    private String returnItemId;
    private String orderId;
    private double total;
    private String date;
}
