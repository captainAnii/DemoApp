package com.geekster.DemoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService; // Injecting HelloService bean using @Autowired


    @GetMapping("/hello")
    public String hello() {
        return helloService.getMessage(); // Invoking getMessage() method of HelloService bean
    }
}
