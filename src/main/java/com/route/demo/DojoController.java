package com.route.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/with-variable")
public class DojoController {



    @RequestMapping("/{dojo}")
    public  String getDojoMessage( @PathVariable("dojo") String dojo){
        if(dojo.equals("dojo"))
            return "The "+dojo +" is awesome!";
        if (dojo.equals("burbank-dojo"))
            return dojo +" is located in Southern California.";
        if (dojo.equals("san-jose"))
            return  dojo+" the headquarters";
        return  "its your choice 1-dojo  2-burbank-dojo   3-san-jose";
    }
}
