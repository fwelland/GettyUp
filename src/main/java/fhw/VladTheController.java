package fhw;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@RequestScoped
@Named()
public class VladTheController
{

    @Getter
    @Setter
    private SearchCritter searchCritter;

    public VladTheController()
    {
        searchCritter = new SearchCritter();
    }


    public void submit()
    {
        System.out.println("the critter is: " + searchCritter);
        System.out.println("the id in VladTheController is " + System.identityHashCode(searchCritter));
    }
}
