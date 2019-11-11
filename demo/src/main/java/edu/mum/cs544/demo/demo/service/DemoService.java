package edu.mum.cs544.demo.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public DemoService() {
        System.out.println("Mini Project 2 :: Constructor loaded");
    }

    public String hello() {
        return "This is Demo app";
    }
}
