package fhw;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SillyDataTableController
{


    private SillyTableItem[] items;

    public SillyDataTableController() {}


    @PostConstruct
    private void init()
    {
        setMASHItems();
    }

    public SillyTableItem[] getItems()
    {
        return items;
    }
    
    private void setMASHItems()
    {
        items = new SillyTableItem[] {
                    SillyTableItem.builder().name("Frank Burns").description("actually a brown toad").value(20).build(),
                    SillyTableItem.builder().name("Trapper John").description("green frog").value(25).build(),
                    SillyTableItem.builder().name("Hawkeye").description("dart frog").value(50).build(),
                    SillyTableItem.builder().name("Radar").description("Yellow Frog").value(100).build()
                };
    }



    public void setSimpsonsItems()
    {
        System.out.println("setSimpsonsItems called");
        items = new SillyTableItem[] {
                    SillyTableItem.builder().name("Hommer").description("Big Fata Yellow toad").value(10).build(),
                    SillyTableItem.builder().name("Marge").description("blue haired frog").value(45).build(),
                    SillyTableItem.builder().name("Bart").description("yellowfrog").value(87).build(),
                    SillyTableItem.builder().name("Maggie").description("blue Frog").value(113).build()
                };
    }

}
