/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLResolver;

/**
 *
 * @author julian
 */
public class SigninPayloadResolver implements GraphQLResolver<SigninPayload>{
    public User user(SigninPayload signinPayload){
        return signinPayload.getUser();
    }
}
