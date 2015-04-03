package com.sachin.sampleapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController
{

    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        model.addAttribute("age", 25);
        return "welcome";
    }

    @RequestMapping(value="/helloagain2", method = RequestMethod.GET)
    public void sayHelloAgain2(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again 2, from Spring 4 MVC");
        model.addAttribute("age", 25);
        //return "welcome";
    }
}
