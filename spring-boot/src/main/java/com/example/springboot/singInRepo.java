package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface singInRepo extends JpaRepository<signIn,Long> {


    List<signIn> findAllByusername(String username);


    @Modifying
    @Query("update signIn u set u.signOutTime = ?1 where u.username = ?2 and u.signInDate=?3")
    void setSignOut(String signOutTime, String username, Date date );
}
