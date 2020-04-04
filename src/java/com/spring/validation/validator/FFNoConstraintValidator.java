package com.spring.validation.validator;

import com.spring.validation.annotation.FFNo;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class FFNoConstraintValidator implements ConstraintValidator<FFNo, String>
{

    private String FFNoPrefix;
    private String FFNoSuffix;
    
    @Override
    public void initialize(FFNo ffNo) {
        FFNoPrefix = ffNo.value().substring(0,2);
        FFNoSuffix = ffNo.value().substring(2,4);
    }

    @Override
    public boolean isValid(String FFNoVal, ConstraintValidatorContext constraintValidatorContext) {
        
        boolean result = false;
        if(FFNoVal!=null){
            result = FFNoVal.startsWith(FFNoPrefix);
            if(result){
                result = FFNoVal.endsWith(FFNoSuffix);
            }
        }
       
       return result; 
    }
}
