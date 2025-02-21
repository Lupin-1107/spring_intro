package com.project.uc2.firstSpringapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/rest")
    public String index(){
        return "hello from amit";
    }
}
