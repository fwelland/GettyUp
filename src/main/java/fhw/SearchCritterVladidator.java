package fhw;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SearchCritterVladidator
        implements ConstraintValidator<VladidSearchCritter,SearchCritter>
{

    @Override
    public void initialize(VladidSearchCritter a)
    {
        System.out.println("SearchCritterVladidator:INIT");
    }

    @Override
    public boolean isValid(SearchCritter t, ConstraintValidatorContext cvc)
    {
        System.out.println("SearchCritterVladidator: isVALID, returning true");
        System.out.println("t.firstName:  " + t.getFirstName());
        System.out.println("the id is:  " + System.identityHashCode(t));
        System.out.println("the validatable copy is: " + t);
        return true;
    }

}
