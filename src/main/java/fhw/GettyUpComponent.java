package fhw;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;


@FacesComponent
public class GettyUpComponent
    extends UIInput 
    implements NamingContainer
{
    public GettyUpComponent() {}

    @Override
    public String getFamily()
    {
        return UINamingContainer.COMPONENT_FAMILY;
    }
    
    
    @Override
    public void decode(FacesContext context)
    {
        if (context == null)
        {
            throw new NullPointerException();
        }
        System.out.println("I have the POWER!!!"); 
    }            
}