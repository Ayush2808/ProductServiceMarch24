package com.scaler.firstspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
//All the apis for coming to end point /sample should come to this controller
// This controller is going to contain HTTP API
// Local Host: 8080/xyz
public class SampleController {
    //localHost: 8080/sayhello()/sample
    @GetMapping("/sayHello")
    public String sayHello(){
        return  "Hello Everyone";
    }

    @GetMapping("/sayBye")
    public String sayBye(){
         return "Bye Everyone";
    }
}



