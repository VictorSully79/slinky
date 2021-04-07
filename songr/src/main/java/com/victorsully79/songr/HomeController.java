package com.victorsully79.songr;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String showHomePage(){




        return "welcome-home.html";
    }
}
