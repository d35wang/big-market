package com.bigmarket.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Singleton;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Singleton
@Path("ping")
public class PingController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld() {
        return "Service is healthy.";
    }
}
