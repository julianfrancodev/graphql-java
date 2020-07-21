package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import graphql.GraphQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author julian
 */
public class Mutation implements GraphQLRootResolver {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;
    
    public Mutation(LinkRepository linkRepository,UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public Link createLink(String url, String description) {
        Link link = new Link(url, description);
        linkRepository.saveLink(link);
        return link;
    }
    
    public User createUser(String name, AuthData authData){
        User user = new User(name, authData.getEmail(), authData.getPassword());
        return userRepository.saveUser(user);
    }
    
    public SigninPayload signinUser (AuthData authData){
        User user = userRepository.findByEmail(authData.getEmail());
        if(user.getPassword().equals(authData.getPassword())){
            return new SigninPayload(user.getId(),user);
        }
        throw new GraphQLException("Invalid Credentials");
    }
    
    
}
