package com.examportal.Exam.Portal.service;

import com.examportal.Exam.Portal.model.User;
import com.examportal.Exam.Portal.model.UserRole;

import java.util.Set;

public interface UserService {

    //creting user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
