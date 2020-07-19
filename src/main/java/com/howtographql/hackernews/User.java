/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtographql.hackernews;

/**
 *
 * @author julian
 */
public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String password;
    
    
    
    public User(String name, String email,String password){
        this(null, name, email,password);
    }
     public User(String id, String name, String email,String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
