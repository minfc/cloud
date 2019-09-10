package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
