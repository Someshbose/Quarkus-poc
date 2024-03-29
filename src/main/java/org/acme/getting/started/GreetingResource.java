package org.acme.getting.started;

import org.acme.getting.started.service.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private HelloService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.sayHello();
    }
}