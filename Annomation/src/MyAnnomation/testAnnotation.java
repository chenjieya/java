package MyAnnomation;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Target({FIELD, METHOD, CONSTRUCTOR})
@Retention(RUNTIME)
public @interface testAnnotation {
    String test();
    int value();
}
