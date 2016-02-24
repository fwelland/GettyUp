package fhw;

import java.io.StringWriter;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
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
        sdtc.setSimpsonsItems();
        SillyTableItem frogs[] = sdtc.getItems();
        JsonArrayBuilder jab = Json.createArrayBuilder();
        for(SillyTableItem sti : frogs)
        {
            jab.add(Json.createObjectBuilder().add("name", sti.getName()).add("description", sti.getDescription()).add("value", sti.getValue()));
        }
        JsonObject model = Json.createObjectBuilder().add("items", jab).build();
        StringWriter stWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stWriter))
        {
            jsonWriter.writeObject(model);
        }
        String jsonData = stWriter.toString();
        System.out.println(jsonData);
        return jsonData;
    }
}