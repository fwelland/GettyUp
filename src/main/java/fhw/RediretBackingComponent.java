package fhw;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@FacesComponent("redirectBacker")
public class RediretBackingComponent
        extends UINamingContainer
{
    public RediretBackingComponent() {}

    private String linkLable;

    public void init()
    {
        System.out.println("RediretBackingComponent init:  " + this);
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
            throws IOException
    {
        System.out.println("RediretBackingComponent::someAction:  " + this);
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath()+"/");
    }
}
