package fhw;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("idaho")
@RequestScoped
public class IdahoBackingComponent

{    
    public IdahoBackingComponent()
    {
        
    }
        
    @PostConstruct
    private void init()
    {
        System.out.println("dem tater's are a growing:  " + this);
    }

    public void potato()
    {
        System.out.println("I like Spuds:  " + this); 
    }    
}
