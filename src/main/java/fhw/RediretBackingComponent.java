package fhw;

import javax.annotation.PostConstruct;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;


@FacesComponent("redirectBacker")
public class RediretBackingComponent
        extends UINamingContainer
{
    public RediretBackingComponent() {}

    private String linkLable;

    @PostConstruct
    private void init()
    {
        System.out.println("RediretBackingComponent post constructor was called:  " + this);
        String s = (String)getAttributes().get("title");
        if(null != s)
        {
            linkLable = "You passed:  " + s;
        }
        else
        {
            linkLable = "nothing passed to me";
        }                
    }
    

    public String getLinkLable()
    {
        System.out.println("RediretBackingComponent::getLinkLable:  " + this);
        return(linkLable);
    }

    public void someAction()
    {
        System.out.println("RediretBackingComponent::someAction:  " + this);
    }
}
