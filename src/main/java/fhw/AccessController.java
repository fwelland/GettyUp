package fhw;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


public class AccessController
{

    @Inject
    protected ExternalContext ec;

    @Inject
    protected FacesContext fc;

    public AccessController()
    {

    }

    @PostConstruct
    private void init()
            throws Exception
    {
        if(fc.getRenderResponse())
        {
            prepareForVerification();
            if(!verify())
            {
                redirect();
            }
            else
            {
                postVerify();
            }
        }
    }

    protected void prepareForVerification()
    {

    }

    protected Boolean verify()
    {
        return(Boolean.TRUE);
    }

    protected void postVerify()
    {

    }

    protected final void redirect()
            throws IOException
    {
        ec.redirect("access-denied.xhtml");
    }
}
