package edu.icet.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeEntity {
    private Integer empId;
    private String title;
    private String name;
    private String nic;
    private String dob;
    private String bankAcNo;
    private String bankBranch;
    private String contact;
    private String address;
}
