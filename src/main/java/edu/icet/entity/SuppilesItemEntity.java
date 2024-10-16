package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SuppilesItemEntity {
    private String itemCode;
    private String description;
    private int qty;
}
