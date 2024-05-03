package com.example.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
@Entity
public class signIn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private Date signInDate;
    private String signInTime;
    private String signOutTime;



    public signIn( String username, Date signInDate, String signInTime, String signOutTime) {

        this.username = username;
        this.signInDate = signInDate;
        this.signInTime = signInTime;
        this.signOutTime = signOutTime;
    }

    public signIn( ) {};



    public String getUsername() {
        return username;
    }

    public Date getSignInDate() {
        return signInDate;
    }

    public String getSignInTime() {
        return signInTime;
    }

    public String getSignOutTime() {
        return signOutTime;
    }




    public void setUsername(String username) {
        this.username = username;
    }

    public void setSignInDate(Date signInDate) {
        this.signInDate = signInDate;
    }

    public void setSignInTime(String signInTime) {
        this.signInTime = signInTime;
    }

    public void setSignOutTime(String signOutTime) {
        this.signOutTime = signOutTime;
    }
}
