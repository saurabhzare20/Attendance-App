package com.example.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String email;

    String Username ;


  String  password ;

  Long   PhoneNumber;

    public User(String email, String password, String username, Long phone) {
        this.email=email;
        this.password=password;
        this.Username= username;
        this.PhoneNumber=phone;

    }
    public User() {


    }


    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public Long getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }



}
