package com.codesquad.signup12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/test")
    public String form() {
        return "/form";
    }

    @GetMapping("/")
    public String welcom() {
        return "/index";
    }

    @GetMapping("/create")
    public String create() {
        return "/create";
    }
}
