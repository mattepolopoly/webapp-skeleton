package services;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path( "/hello" )
public class Resource
{
    @GET
    @Produces( "text/html" )
    public String printHelloWorld( )
    {
        return "Hello World";
    }
}