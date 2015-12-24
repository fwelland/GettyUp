package fhw;

import javax.inject.Named;
import lombok.Data;

@Named
@Data
public class GetFormController
{
    private String valueFromGet; 
    private Integer formIValue; 
    
    public GetFormController()
    {
        
    }
}
