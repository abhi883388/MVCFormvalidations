/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.validation.annotation;

import com.spring.validation.validator.FFNoConstraintValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = FFNoConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFNo {
    
    public String value() default "FFIN";
    
    public String message() default "*Enter a valid FF No.";
    
    public Class<?>[] groups() default {};
    
    public Class<? extends Payload>[] payload() default {};
   
   
    
}
