package com.anand.userservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("")
    public String  hello()
    {
        return "Hello from Rahul Anand, This confirms deployment is working";
    }


}
