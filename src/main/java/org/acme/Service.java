package org.acme;

import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/service") 
public class Service {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greetings() {
        return "Hello from service";
    }
}
