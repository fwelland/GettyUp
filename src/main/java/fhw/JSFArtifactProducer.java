package fhw;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@RequestScoped
public class JSFArtifactProducer
{
    private ExternalContext ec;

    private FacesContext fc;

    public JSFArtifactProducer()
    { }


    @PostConstruct
    private void init()
    {
        fc = FacesContext.getCurrentInstance();
        ec = fc.getExternalContext();
    }

    @Produces
    public ExternalContext getEC()
    {
        return(ec);
    }

    @Produces
    public FacesContext getFC()
    {
        return(fc);
    }
}
