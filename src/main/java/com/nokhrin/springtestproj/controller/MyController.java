package com.nokhrin.springtestproj.controller;


import com.nokhrin.springtestproj.model.MyUser;
import com.nokhrin.springtestproj.model.MyUserRole;
import com.nokhrin.springtestproj.service.MyUserRoleService;
import com.nokhrin.springtestproj.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
//@RequestMapping("/api/messages")
public class MyController {

    @Autowired
    MyUserService myUserService;

    @Autowired
    MyUserRoleService myUserRoleService;

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @GetMapping("/fck/{userName}")
    public String firstMethod(@PathVariable String userName){
        return "Fuck "+userName;
    }

    @GetMapping("/msg")
    public String getMessage(){
        return "Message";
    }

    @GetMapping("/getUser")
    public MyUser secondMethod(){
        MyUser myUser = new MyUser();
        myUser.setAge(19);
        myUser.setEmail("email");
        myUser.setPassword("1111");
        myUser.setFirstName("John");
        myUser.setLastName("Cena");

        myUserService.addMyUser(myUser);
        return myUser;
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/setRole/{idUser}/{role}")
    public MyUser setMyUserRoleToUser(@PathVariable long idUser, @PathVariable String role){
        MyUserRole myUserRole = myUserRoleService.getAppUserRole(role);
        MyUser myUser = myUserService.getMyUser(idUser);
        myUser.getAppUserRole().add(myUserRole);
        myUserService.editMyUser(myUser);
        return myUser;
    }
}
