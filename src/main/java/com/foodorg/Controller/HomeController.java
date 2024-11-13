package com.foodorg.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index.html")
    public String home() {
        return "index.html";
    }

    @GetMapping("/private.html")
    public String privatMain() {
        return "private.html";
    }
    @GetMapping("/private/privat.html")
    public String privat() {
        return "privat.html";
    }
    @GetMapping("/organisation.html")
    public String organisation() {
        return "organisation.html";
    }
    @GetMapping("/erhverv.html")
    public String erhverv() {
        return "erhverv.html";
    }

    @GetMapping("/private/profile.html")
    public String profile() {
        return "profile.html";
    }
}