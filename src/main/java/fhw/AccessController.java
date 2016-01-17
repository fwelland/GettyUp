package fhw;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;


public class AccessController
{

    @Inject
    private ExternalContext ec;

    public AccessController()
    {

    }

    @PostConstruct
    private void init()
            throws Exception
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
