package com.example.E_Commerce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GeneralController {

    @GetMapping
    public String hey(){
        return "Hello developer";
    }
}
