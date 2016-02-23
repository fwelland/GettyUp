package fhw;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data 
public class SillyTableItem
{    
    private String name; 
    private String description;
    private Integer value; 
}
