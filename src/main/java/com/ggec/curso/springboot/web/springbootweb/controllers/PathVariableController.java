package com.ggec.curso.springboot.web.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggec.curso.springboot.web.springbootweb.models.UserModel;
import com.ggec.curso.springboot.web.springbootweb.models.dto.ParamDto;

/**
 * 
 */
@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    /**
     * 
     * @param message
     * @return
     */
    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    /**
     * 
     * @param product
     * @param id
     * @return
     */
    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVariable(
            @PathVariable String product,
            @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    /**
     * 
     * @param userModel
     * @return
     */
    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel userModel) {
        userModel.setName(userModel.getName().toUpperCase());

        return userModel;
    }

}
