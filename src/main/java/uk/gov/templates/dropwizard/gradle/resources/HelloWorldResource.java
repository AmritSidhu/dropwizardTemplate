package uk.gov.templates.dropwizard.gradle.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
public class HelloWorldResource {

    @GET
    public String getHelloWorld() {
        return "Hello World";
    }
}
