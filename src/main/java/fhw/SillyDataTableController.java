package fhw;

import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.cdi.Param;

@Named
public class SillyDataTableController
    extends AccessController
{
    
    

    public SillyDataTableController() {}
    
    
    
    public SillyTableItem[] getItems()
    {
        return (new SillyTableItem[] {
                    SillyTableItem.builder().name("Frank Burns").description("actually a brown toad").value(20).build(),
                    SillyTableItem.builder().name("Trapper John").description("green frog").value(25).build(),
                    SillyTableItem.builder().name("Hawkeye").description("dart frog").value(50).build(),
                    SillyTableItem.builder().name("Radar").description("Yellow Frog").value(100).build()
                }); 
    }        
    
    
    
    public SillyTableItem[] getDifferentItems()
    {
        return (new SillyTableItem[] {
                    SillyTableItem.builder().name("Hommer").description("Big Fata Yellow toad").value(10).build(),
                    SillyTableItem.builder().name("Marge").description("blue haired frog").value(45).build(),
                    SillyTableItem.builder().name("Bart").description("yellowfrog").value(87).build(),
                    SillyTableItem.builder().name("Maggie").description("blue Frog").value(113).build()
                }); 
    }            
    
}
