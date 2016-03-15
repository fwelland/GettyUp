package fhw;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.TagConfig;
import javax.faces.view.facelets.TagHandler;

public class IdahoHandler
    extends TagHandler        
{
    public IdahoHandler(TagConfig tc)
    {
        super(tc);
    }

    @Override
    public void apply(FaceletContext ctx, UIComponent parent) 
            throws IOException
    {
        System.out.println("IdahoHandler was called!"); 
    }
    
}
