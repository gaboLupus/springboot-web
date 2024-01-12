package com.ggec.curso.springboot.web.springbootweb.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggec.curso.springboot.web.springbootweb.models.UserModel;
import com.ggec.curso.springboot.web.springbootweb.models.dto.UserDTO;

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
    public UserDTO details() {
        UserDTO dto = new UserDTO();
        UserModel user = new UserModel("guillermo", "espinoza");
        dto.setTitle("Hola mundo Spring Boot");
        dto.setUser(user);
        return dto;
    }

    /**
     * 
     * @return
     */
    @GetMapping("/list")
    public List<UserModel> list() {
        List<UserModel> list = new ArrayList<>();
        list.add(new UserModel("Guillermo", "Espinoza"));
        list.add(new UserModel("Obed", "Espinoza"));
        list.add(new UserModel("Aida", "Espinoza"));
        return list;

    }

    /**
     * 
     * @return
     */
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        Map<String, Object> map = new HashMap<>();
        UserModel user = new UserModel("guillermo", "espinoza");
        map.put("title", "Hola mundo Spring Boot");
        map.put("user", user);
        return map;
    }

}
