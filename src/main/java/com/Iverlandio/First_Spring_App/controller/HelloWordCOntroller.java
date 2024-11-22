package com.Iverlandio.First_Spring_App.controller;



import com.Iverlandio.First_Spring_App.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/hello-world"})

public class HelloWordCOntroller {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String hello_world(){
        return helloWorldService.helloWorld("  Iverlandio");
    }

}
