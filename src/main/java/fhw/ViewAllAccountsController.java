package fhw;

import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.cdi.Param;

@Named
public class ViewAllAccountsController
    extends AccessController
{

    @Getter
    @Setter
    @Inject @Param(name = "gid")
    private Long groupId;

    public ViewAllAccountsController()
    {
    }

    @Override
    protected void prepareForVerification()
    {
        System.out.println("prepareForVerfiication: some long loading hree");
    }


    @Override
    protected Boolean verify()
    {
        System.out.println("verify");
        return(!Long.valueOf(57).equals(groupId));
    }

    @Override
    protected void postVerify()
    {
        System.out.println("postVerify");
    }

}
