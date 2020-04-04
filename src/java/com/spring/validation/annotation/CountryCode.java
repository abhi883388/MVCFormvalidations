/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.validation.annotation;

import com.spring.validation.validator.CountryConstraintValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CountryConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CountryCode {
    
    //define value
    public String value() default "0";
    
    
    //define message
    public String message() default "*Select a valid country";
    
    
    //define groups
    public Class<?>[] groups() default {};
    
    //define payload
    public Class<? extends Payload>[] payload() default {};
    
    
}
