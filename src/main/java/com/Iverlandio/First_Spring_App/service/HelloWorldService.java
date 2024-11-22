package com.Iverlandio.First_Spring_App.service;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name ){

        return "hello-world" + name;
    }
}
