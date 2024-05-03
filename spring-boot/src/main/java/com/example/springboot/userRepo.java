package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo  extends   JpaRepository<User,Long> {
    User findByemail(String email);


}
