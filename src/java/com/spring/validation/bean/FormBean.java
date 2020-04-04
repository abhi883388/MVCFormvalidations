package com.spring.validation.bean;

import com.spring.validation.annotation.FlightCode;
import java.util.LinkedHashMap;
import javax.validation.constraints.NotEmpty;





public class FormBean {
    
    //Validation to check empty field
    @NotEmpty( message = "* Name is required")
    private String name;
    
    //Validation to check empty field
    @NotEmpty( message = "* Date of Birth is required")
    private String dob;
    
    private String fromCountry;
    private String toCountry;
    
    //Validation to check empty field
    @NotEmpty(message="* Visa Type is required") 
    private String visaType;
    
    private String[] langKnown;
    private final LinkedHashMap<String, String> countryOptions;

    // Adding custom validation to flight code -- must start with ANZ/AI/BA
    @FlightCode(value = {"ANZ","AI","BA"},message = "* Flight Code must start with ANZ/AI/BA")
    private String flightCode;
    
    public FormBean() {
        
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("IN", "India");
        countryOptions.put("PK","Pakistan");
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String[] getLangKnown() {
        return langKnown;
    }

    public void setLangKnown(String[] langKnown) {
        this.langKnown = langKnown;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    
    
    
    
    
}
