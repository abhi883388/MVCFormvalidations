
package com.spring.validation.annotation;

import com.spring.validation.validator.FlightCodeConstraintValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = FlightCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FlightCode {
    
    public String[] value() default "ANZ";
    
   
    
    public String message() default "* Flight Code must start with ANZ";
    
    //default groups
    public Class<?>[] groups() default {};
    
    //default payloads
    public Class<? extends Payload>[] payload() default {};
}
