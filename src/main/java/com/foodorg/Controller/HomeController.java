package com.foodorg.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/privat")
    public String privat() {
        return "privat.html";
    }
    @GetMapping("/organisation")
    public String organisation() {
        return "organisation.html";
    }

    @GetMapping("/privat/profil")
    public String profil() {
        return "profil.html";
    }
}