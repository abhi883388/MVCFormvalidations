
package com.spring.validation.controller;

import com.spring.validation.bean.FormBean;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;
    
    @RequestMapping("")
    public String showHomePage(){
        return "index";
    }
    
     @RequestMapping("/showForm")
    public String showForm(Model model){
        FormBean formBean = new FormBean();
        model.addAttribute("formData",formBean);
        model.addAttribute("countryOptions",countryOptions);
        return "flight-form";
    }
    
     @RequestMapping("/processForm")
    public ModelAndView processForm(@Valid @ModelAttribute("formData") FormBean formBean,
            BindingResult theBinding){
        ModelAndView model = new ModelAndView("flight-form");
        if(theBinding.hasErrors()){
             model.addObject("formData", formBean);
             model.addObject("countryOptions",countryOptions);
             model.addObject("status","fail");
        }
        else{
            model.addObject("formData", formBean);
            model.addObject("countryOptions",countryOptions);
            model.addObject("status","pass");
        }
         return model;
    }

   
    
}
