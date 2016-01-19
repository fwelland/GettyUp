package fhw;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Account
{

    private Long id;
    private String title;
    private BigDecimal principle;
    private BigDecimal balance;
    private Long ownerId;
    private Long groupId;

    public Account()
    {

    }

    
}
