package com.sgm.sgmwebpro.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Indexcontroller {

    @RequestMapping("/")
     public String greet(){
         return "WellCome To SGM SoftWare Pvt Ltd..,";
     }

     @RequestMapping("/contact")
     public String contact(){
        return "Contact Saravana - itssaravana2001@gmial.com";
    }
}
