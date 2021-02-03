package com.run.baby.run.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainController {

    @RequestMapping(method = {RequestMethod.POST}, value = "/hello.htm")
    @ResponseBody()
    @ResponseStatus(HttpStatus.OK)
    public String test () {
       String hello = "Hello";
       return hello;
    }
}
