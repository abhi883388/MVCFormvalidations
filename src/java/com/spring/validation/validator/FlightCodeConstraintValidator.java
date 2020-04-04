
package com.spring.validation.validator;

import com.spring.validation.annotation.FlightCode;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FlightCodeConstraintValidator implements ConstraintValidator<FlightCode, String>{
    
    private String[] flightPrefix;

    @Override
    public void initialize(FlightCode flightCode) {
        flightPrefix = flightCode.value();
    }

    @Override
    public boolean isValid(String flightCode, ConstraintValidatorContext constraintValidatorContext) {
       
        boolean result = false;
        
        if(flightCode!=null){
            /*
            if(flightCode.startsWith(flightPrefix)){
                result=true;
            }
            */
            for(String tempPrefix:flightPrefix){
                result = flightCode.startsWith(tempPrefix);
                if(result){
                    break;
                }
            }

            
        }
        return result;

    }
}    
