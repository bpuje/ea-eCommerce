package edu.mum.cs544.demo.demo.controller;

import edu.mum.cs544.demo.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

    @Autowired
    DemoService demoService;

    @GetMapping
    public String hello(){
        return demoService.hello();
    }

}
