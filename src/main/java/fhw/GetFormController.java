package fhw;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Max;
import lombok.Data;

@Named
@Data
@RequestScoped
public class GetFormController
{
    private String valueFromGet;

    @Max(50)
    private Integer formIValue;

    public GetFormController()
    {

    }
    
    public void setValueFromGet(String s)
    {
        valueFromGet = s;
    }
}
