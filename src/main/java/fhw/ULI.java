package fhw;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Data;

@Named("uli")
@SessionScoped
@Data
public class ULI
    implements Serializable
{

    private static final long serialVersionUID = 6806891811894241564L;
    private String userName;
}
