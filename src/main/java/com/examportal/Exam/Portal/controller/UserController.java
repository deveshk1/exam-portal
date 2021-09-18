package com.examportal.Exam.Portal.controller;

import com.examportal.Exam.Portal.model.Role;
import com.examportal.Exam.Portal.model.User;
import com.examportal.Exam.Portal.model.UserRole;
import com.examportal.Exam.Portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles= new HashSet<>();

        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("Normal User");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

      return this.userService.createUser(user,roles);

    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }


    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);
    }



}
