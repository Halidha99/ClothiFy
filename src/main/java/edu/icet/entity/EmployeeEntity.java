package edu.icet.entity;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeEntity {

    private String empId;
    private String title;
    private String name;
    private String nic;
    private String address;
    private LocalDate dob;
    private String contact;
    private String bankAcNo;
    private String bankBranch;

}
