package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // szczególny przypadek adnotacji @Component. Wykorzytstywany jest własnie w app webowych
public class HomeController {

    @RequestMapping("/")
    public String nowStart() {
        return "main-menu"; // view name
    }
}
