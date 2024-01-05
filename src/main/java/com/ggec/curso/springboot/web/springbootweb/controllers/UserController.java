package com.ggec.curso.springboot.web.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserRestController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Guillermo");
        model.addAttribute("lastName", "Espinoza");
        return "details";
    }

}
