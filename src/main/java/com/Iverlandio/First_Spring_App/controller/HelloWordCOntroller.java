package com.Iverlandio.First_Spring_App.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/hello-world"})
public class HelloWordCOntroller {

    @GetMapping
    public String hello_world(){
        return "hello_World";
    }

}
