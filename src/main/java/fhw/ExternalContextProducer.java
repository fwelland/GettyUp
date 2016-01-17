package fhw;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@RequestScoped
public class ExternalContextProducer
{
    private ExternalContext ec;

    public ExternalContextProducer()
    { }


    @PostConstruct
    private void init()
    {
        ec = FacesContext.getCurrentInstance().getExternalContext();
    }

    @Produces
    public ExternalContext getEC()
    {
        return(ec);
    }
}
