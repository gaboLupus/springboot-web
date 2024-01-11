package com.ggec.curso.springboot.web.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ggec.curso.springboot.web.springbootweb.models.UserModel;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 
 */
@Controller
public class UserController {

    /**
     * 
     * @param model
     * @return
     */
    @GetMapping("/details")
    public String details(Model model){
        UserModel user = new UserModel("guillermo", "espinoza");
        user.setEmail("guillermoespinoza@correo.com");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user",user);
        return "details";
    }

    /**
     * 
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String list( ModelMap model) {
        // model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios.");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<UserModel> userModel(){
        return Arrays.asList(
            new UserModel("Juan", "Perez","juanPerez@correo.com"),
            new UserModel("Pepe", "Pecas"),
            new UserModel("Lucho ", "Lopez","luchoLopez@mail.com"),
            new UserModel("Martin", "Corona")
        );
    }

}
