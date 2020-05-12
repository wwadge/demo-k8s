package com.example.demo;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class FooController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello";
    }
}
