package com.examportal.Exam.Portal.repo;

import com.examportal.Exam.Portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUserName(String userName);
}
