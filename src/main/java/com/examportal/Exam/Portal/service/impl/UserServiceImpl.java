package com.examportal.Exam.Portal.service.impl;

import com.examportal.Exam.Portal.model.User;
import com.examportal.Exam.Portal.model.UserRole;
import com.examportal.Exam.Portal.repo.RoleRepository;
import com.examportal.Exam.Portal.repo.UserRepository;
import com.examportal.Exam.Portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating User
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception{

        User local = this.userRepository.findByUserName(user.getUserName());

        if(local!=null){
            System.out.println("User Exist");
            throw new Exception("User Already Exist");
        }
        else{
            //create user
            for(UserRole ur:userRoles){
            roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles); //set all roles to user
            local = this.userRepository.save(user);

        }

        return local;
    }




}
