package fhw;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.annotation.PostConstruct;

@Named("privileges")
@SessionScoped
public class PrivilegeList
    extends ArrayList<Privilege>
    implements Serializable
{
    public PrivilegeList()
    {

    }

    @PostConstruct
    private void init()
    {
        add(Privilege.ViewAccount);
    }
}
