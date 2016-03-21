package fhw;

import java.io.StringWriter;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonWriter;

@Named
@RequestScoped
public class DatatableTestController
{
    
    
    public String getData1()
    {
        String s =  "[ " +
                    "  [\"Henry\",\"Orange Frog\", \"$25.00\"], " +
                    "  [\"Howard\",\"Purple Frog\", \"$26.00\"], " +
                    "  [\"Ron\",\"Yellow Frog\", \"$27.00\"] " +
                    "]";
        
        return(s);         
    }
    
    
    private SillyTableItem[] items = new SillyTableItem[] {
                    SillyTableItem.builder().name("Hommer").description("Big Fat Yellow toad").value(10).build(),
                    SillyTableItem.builder().name("Marge").description("Blue haired frog").value(45).build(),
                    SillyTableItem.builder().name("Bart").description("Yellow frog").value(87).build(),
                    SillyTableItem.builder().name("Maggie").description("Blue Frog").value(113).build()
                };    
    
    public String getData()
    {
        JsonArrayBuilder jab = Json.createArrayBuilder();
        for(SillyTableItem sti : items)
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
