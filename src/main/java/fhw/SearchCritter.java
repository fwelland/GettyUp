
package fhw;

import java.io.Serializable;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@VladidSearchCritter(groups = SearchCritterVladGroup.class)
public class SearchCritter
        implements Serializable
{
    private static final long serialVersionUID = 852871896194485039L;
    @Pattern(regexp = "fred", groups = SearchCritterVladGroup.class)
    private String firstName;

    @Pattern(regexp = "garvin", groups = SearchCritterVladGroup.class)
    private String lastName;

    @Pattern(regexp = "123", groups = SearchCritterVladGroup.class)
    private String id;

    @Pattern(regexp = "cheeze", groups = SearchCritterVladGroup.class)
    private String tagLine;
}
