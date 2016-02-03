package fhw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("frogws")
public class FrogWS
{
    @Context
    private UriInfo context;

    public FrogWS()
    {
    }

    @GET
    @Path("{content_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String acknowledge(@PathParam("content_id")String content_id)
    {
        System.out.println("content_id " + content_id);
        return "{}";
    }
}