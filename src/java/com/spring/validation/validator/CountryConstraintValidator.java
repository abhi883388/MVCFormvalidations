/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.validation.validator;

import com.spring.validation.annotation.CountryCode;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CountryConstraintValidator implements ConstraintValidator<CountryCode, String>{

    //varable for checking purpose
    private String inValidCountryCode;
    
    @Override
    public void initialize(CountryCode countryCode) {
        inValidCountryCode=countryCode.value();
    }

    @Override
    public boolean isValid(String countryCodeVal, ConstraintValidatorContext constraintValidatorContext) {
        
        boolean result = true;
        if(countryCodeVal!=null){
            if(countryCodeVal.equals(inValidCountryCode))
            {
                result = false;
            }
        }
        return result;
    }
    
}
