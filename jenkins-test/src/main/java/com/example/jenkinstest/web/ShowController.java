package com.example.jenkinstest.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @RequestMapping("show")
    public String show(){
        return "hello world";
    }
}
