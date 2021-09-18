package com.examportal.Exam.Portal;

import com.examportal.Exam.Portal.model.Role;
import com.examportal.Exam.Portal.model.User;
import com.examportal.Exam.Portal.model.UserRole;
import com.examportal.Exam.Portal.service.UserService;
import org.h2.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();
//		user.setFirstName("devesh");
//		user.setLastName("kumar");
//		user.setUserName("deveshk11");
//		user.setPassword("123");
//		user.setEmail("email.com");
//		user.setProfile("default.png");
//
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//
//		 UserRole userRole = new UserRole();
//		 userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUserName());
	}
}
