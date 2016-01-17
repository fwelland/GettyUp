package fhw;

import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("auth")
@RequestScoped
public class Authorizer
{

    @Inject
    private ExternalContext ec;

    @Inject
    private PrivilegeList privileges;

    public Authorizer()
    {

    }

    public Boolean isAuthorized(Privilege p)
    {
        return(privileges.contains(p));
    }

    public void authorizeOrRedirect(Privilege p)
        throws IOException
    {
        if(!isAuthorized(p))
        {
            ec.redirect("access-denied.xhtml");
        }
    }
}
