package com.bmcho.springsecuritypractice.user;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRegisterDto {
    private String username;
    private String password;
}
