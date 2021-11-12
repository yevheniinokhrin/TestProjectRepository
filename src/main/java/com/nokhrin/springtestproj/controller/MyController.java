package com.nokhrin.springtestproj.controller;


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
}
