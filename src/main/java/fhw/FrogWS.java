package fhw;

import java.io.StringWriter;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;


@Path("frogws")
public class FrogWS
{
    @Context
    private UriInfo context;


    @Inject
    private ULI uli;

    public FrogWS()
    {
    }


    @GET
    @Path("{content_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String acknowledge(@PathParam("content_id")Integer content_id)
    {
        System.out.println("content_id " + content_id);
        Boolean isEven = Boolean.FALSE;
        if(content_id % 2 == 0)
        {
            isEven = Boolean.TRUE;
        }
        JsonObject model = Json.createObjectBuilder().add("result", isEven).build();
        StringWriter stWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stWriter))
        {
            jsonWriter.writeObject(model);
        }
        String jsonData = stWriter.toString();
        System.out.println(jsonData);
        if(null != uli)
        {
            System.out.println("uli is not null");
            String u = uli.getUserName();
            if(null != u)
            {
                System.out.println("username:  " + u);
            }
            else
            {
                System.out.println("null/empty username");
            }
        }
        else
        {
            System.out.println("uli is null; injection no worky????");
        }
        return jsonData;
    }
}