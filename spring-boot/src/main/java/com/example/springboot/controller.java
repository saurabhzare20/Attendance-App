package com.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;

@RestController
public class controller {

   @Autowired
   private userRepo userRepo;


   @Autowired
   private  singInRepo singInRepo;


    @Autowired
    private service service;

    // API 1 - Login
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) throws exception {
       String username= service.authorizelogin(email,password);
        return username;
    }

    // API 2 - Register
    @PostMapping("/register")
    public ResponseEntity<Integer> register(@RequestParam String username, @RequestParam String email,
                                   @RequestParam String password, @RequestParam Long phoneNumber) {
         service.register(email,password,username,phoneNumber);
         return  ResponseEntity.ok(200);
    }

    // API 3 - Sign in
    @GetMapping("/signin/{username}")
    public ResponseEntity<Integer> signIn(@PathVariable String username) {

       service.signInService(username);
       return ResponseEntity.ok(200);
    }

    // API 4 - Sign out
    @GetMapping("/signout/{username}")
    public ResponseEntity<Integer> signOut(@PathVariable String username) {

       service.signOutService(username);
       return ResponseEntity.ok(200);
    }

    // API 5 - Load records
    @GetMapping("/load-records")
    public List<signIn> loadRecords(@RequestParam String username) {

        return service.load(username);
    }

    // API 6 - Give all users
    @GetMapping("/all-users")
    public List<User> getAllUsers() {

        return service.getAllUsers();
    }
}

