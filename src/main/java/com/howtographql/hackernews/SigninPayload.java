package com.howtographql.hackernews;


import com.howtographql.hackernews.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julian
 */
public class SigninPayload {
    private final String token;
    private final User user;
    
    public SigninPayload(String token, User user){
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public User getUser() {
        return user;
    }
    
    
}
