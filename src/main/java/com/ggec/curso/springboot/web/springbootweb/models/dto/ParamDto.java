package com.ggec.curso.springboot.web.springbootweb.models.dto;

public class ParamDto {

    private String message;

    public ParamDto() {
    }

    public ParamDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
