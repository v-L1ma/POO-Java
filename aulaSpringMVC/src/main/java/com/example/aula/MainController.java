package com.example.aula;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String principal(){
        return "index";
    }

    @GetMapping("/p1")
    public String p1(){
        return "p1";
    }

    @GetMapping("/p2")
    public String p2(){
        return "p2";
    }

    @GetMapping("/p3")
    public String p3(){
        return "p3";
    }

}
