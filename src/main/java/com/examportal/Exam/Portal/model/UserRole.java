package com.examportal.Exam.Portal.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    //A role will belong to a single user only
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;
}
