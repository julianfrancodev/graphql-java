package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

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

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link createLink(String url, String description) {
        Link link = new Link(url, description);
        linkRepository.saveLink(link);
        return link;
    }
}
