package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Service
public class service {


    @Autowired
    private userRepo userRepo;

    @Autowired
    private singInRepo singInRepo;

    public String authorizelogin(String email, String password) throws exception {
        User user1 = userRepo.findByemail(email);
        if(user1 == null){
            throw new exception("user not exist");
        }
        if(!Objects.equals(user1.password, password)){
            throw new exception("wrong password");
        }

        return user1.Username;}

        public void register(String email, String password, String Username,Long phone){
         User user1= new User(email,password,Username,phone) ;
        userRepo.save(user1);







    }

    public void signInService( String Username){
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        LocalTime currentTime = LocalTime.now();



        signIn s= new signIn(Username,today.getTime(), currentTime.toString(), null  );

        singInRepo.save(s);

    }
    public void signOutService( String Username) {
        CharSequence originalString = null;
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        LocalTime currentTime = LocalTime.now();

      singInRepo.setSignOut(currentTime.toString(),Username,today.getTime());

    }


    public  List<signIn>  load(String Username){

       return singInRepo.findAllByusername(Username);
    }


    public List<User> getAllUsers() {
       return userRepo.findAll();
    }
}
