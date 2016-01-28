package fhw;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("FrogBack")
public class FrogBackingComponent
        extends UINamingContainer
{
    public FrogBackingComponent() {}

    private String linkLable;

    public void initialize()
    {
        System.out.println("BC initialize was called");
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
        System.out.println("BC called");
        return(linkLable);
    }

    public void someAction()
    {
        System.out.println("Action was pressed");
    }
}
