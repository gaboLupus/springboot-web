package com.ggec.curso.springboot.web.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ggec.curso.springboot.web.springbootweb.models.dto.ParamDto;
import com.ggec.curso.springboot.web.springbootweb.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 */
@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    /**
     * 
     * @param message
     * @return
     */
    @GetMapping("/foo")
    public ParamDto foo(
            @RequestParam(required = false, defaultValue = "Hola que tal") String message) {
        ParamDto dto = new ParamDto();
        dto.setMessage(message);
        return dto;
    }

    /**
     * 
     * @param text
     * @param code
     * @return
     */
    @GetMapping("/bar")
    public ParamMixDto bar(
            @RequestParam String text,
            @RequestParam Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    /**
     * 
     * @param request
     * @return
     */
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        ParamMixDto params = new ParamMixDto();
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }
    

}
