package edu.icet.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SuppilesItem {
    private String itemCode;
    private String description;
    private int qty;
}
