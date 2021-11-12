package com.nokhrin.springtestproj.controller;


import com.nokhrin.springtestproj.model.MyUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/fck/{userName}")
    public String firstMethod(@PathVariable String userName){
        return "Fuck "+userName;
    }
    @GetMapping("/getUser")
    public MyUser secondMethod(){
        MyUser myUser = new MyUser();
        myUser.setAge(19);
        myUser.setEmail("312312");
        myUser.setFirstName("John");
        myUser.setLastName("Cena");
        return myUser;
    }
}
