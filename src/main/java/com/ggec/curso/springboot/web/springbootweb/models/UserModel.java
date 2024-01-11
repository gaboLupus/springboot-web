package com.ggec.curso.springboot.web.springbootweb.models;
/**
 * 
 */
public class UserModel {

    private String name;
    private String lastName;
    private String email;

    /**
     * 
     */
    public UserModel() {
    }

    /**
     * 
     * @param name
     * @param lastName
     */
    public UserModel(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * 
     * @param name
     * @param lastName
     * @param email
     */
    public UserModel(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
}
