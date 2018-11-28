package com.springcloud.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="hell")
    public String hello(){
        return "hello";
    }
}
