package fhw;

import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Named
public class ViewAllAccountsController
    extends AccessController
{

    @Inject
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private ExternalContext ec;

    public ViewAllAccountsController()
    {

    }

    
}
