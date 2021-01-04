package com.route.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
    @RequestMapping("/coding")
    public String getHelloMessage(){
        return "Hello Coding Dojo!";
    }


    @RequestMapping("coding/python")
    public String displayPythonMessage(){
        return "Python/Django was awesome!";
    }

    @RequestMapping("coding/java")
    public String displayJavaMessage(){
        return "Java/Spring is better!";

    }

}
