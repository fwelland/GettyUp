package fhw;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = { SearchCritterVladidator.class })
@Documented
@Target({ TYPE, METHOD, FIELD })
@Retention(RUNTIME)
public @interface VladidSearchCritter
{
    String message() default "Invladid critter";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
