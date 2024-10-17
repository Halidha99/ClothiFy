package edu.icet.model;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private String userType;
}
