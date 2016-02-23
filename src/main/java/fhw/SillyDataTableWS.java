package fhw;

import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.json.JsonWriter;


@Path("frogtable")
public class SillyDataTableWS
{

    @Inject 
    private SillyDataTableController sdtc; 
    
    public SillyDataTableWS()
    {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String pressed()
    {
        SillyTableItem frogs[] = sdtc.getDifferentItems(); 
        
        JsonArray ja = new JsonArray();
        

    //Json.createArrayBuilder().
            
            
//            .add(Json.createObjectBuilder()
//      .add("firstName", "John")
//      .add("lastName", "Doe")))
//  .build();        
        Jas
        //Json.createObjectBuilder().add(
        //JsonObject model = Json.createObjectBuilder().add("result", frogs).build();
        StringWriter stWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stWriter))
        {
            jsonWriter.writeObject(model);
        }
        String jsonData = stWriter.toString();

        return jsonData;
    }
}