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
public class Link {
    
    private final String id;
    private final String url;
    private final String description;

  
    public Link(String id, String url, String description){
        this.id = id;
        this.url = url;
        this.description = description;
    }
    
    public Link(String url, String description) {
        this(null, url, description);
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }
    
    
    
}
