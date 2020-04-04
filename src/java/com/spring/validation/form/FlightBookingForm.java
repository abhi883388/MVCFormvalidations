/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.validation.form;

import com.spring.validation.annotation.CountryCode;
import com.spring.validation.annotation.FFNo;
import java.util.LinkedHashMap;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class FlightBookingForm {
    
    @NotEmpty(message = "*Name is required")
    private String name;
    
    @NotEmpty(message = "*Origin is required")
    @CountryCode()
    private String fromCountry;
    
    @NotEmpty(message = "*Destination is required")
    @CountryCode()
    private String toCountry;
    
    @Size(min = 4, message = "*FF No. minimum 4 characters")
    @FFNo()
    private String frequentFlyer;
    
    @Pattern(regexp ="^[0][1-9]\\d{9}$|^[1-9]\\d{9}$" , message = "*Enter valid Mobile No.")
    private String mobileNo;
    
    
    private LinkedHashMap<String,String> countryList;

    //For Loading country list at call
    public FlightBookingForm() {
    
        countryList = new LinkedHashMap<>();
        countryList.put("NZ", "New Zealand");
        countryList.put("IN", "India");
        countryList.put("US", "USA");
        countryList.put("CA", "Canada");
        countryList.put("IT", "Italy");
        
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(String frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public LinkedHashMap<String, String> getCountryList() {
        return countryList;
    }
    
    
    
    
}
