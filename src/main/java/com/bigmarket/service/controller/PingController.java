package com.bigmarket.service.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bigmarket.service.resource.Ping;
import com.google.inject.Singleton;

@Singleton
@Path("ping")
public class PingController implements Ping {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Service is healthy!";
    }
}
