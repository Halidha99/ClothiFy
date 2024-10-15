package edu.icet.entity;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class UserEntity {
    private int id;
    private String userName;
    private String email;
    private String password;
    private String userType;
}
