package com.ggec.curso.springboot.web.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 */
@RestController
@RequestMapping("/api")
public class UserRestController {

    /**
     * 
     * @return
     */
    @GetMapping("/details")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring Boot");
        body.put("name", "Guillermo");
        body.put("lastName", "Espinoza");
        return body;
    }

}
