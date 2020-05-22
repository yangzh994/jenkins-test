package com.example.jenkinstest.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController1 {

    @RequestMapping("show1")
    public String show(){
        return "hello world 1111111111111111111111111111111111";
    }
}
