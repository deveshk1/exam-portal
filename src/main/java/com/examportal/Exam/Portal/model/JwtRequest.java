package com.examportal.Exam.Portal.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JwtRequest {

    private String userName;
    private String password;

    public JwtRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
