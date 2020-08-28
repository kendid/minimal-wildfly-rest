package com.github.kendid;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorld {
    @GET
    public String getHelloWorld() {
        return "<p>Hello world</p>";
    }
}
