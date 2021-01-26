package com.services.myappointmentrestapi.controller.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {
    List <String> names = new ArrayList<>();
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name;
    }
    @GetMapping("/greeting/")
    public String helloGreeting(){
        return "Hello " + names.toString();
    }
    @PostMapping("add")
    public void addName(@RequestParam String name){
        this.names.add(name);
    }
}
