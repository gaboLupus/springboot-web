package com.ggec.curso.springboot.web.springbootweb.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

    @Value("${config.username}")
    private String username;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}")
    private Integer code;

    @Value("#{${config.valuesMap}}")
    private Map<String,Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private Integer price;

    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> valueList;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @Autowired
    private Environment environment;

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

    /**
     * 
     * @return
     */
    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("code2", environment.getProperty("config.code",Integer.class));
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valueString", valueString);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);
        return json;
    }

}
