package com.fellah.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fellah.api.model.Charge;
import com.fellah.api.service.ChargeService;

@RestController
@RequestMapping("/charge")
@CrossOrigin(origins= "*")
public class ChargeController {

	
	@Autowired
    private ChargeService chargeService;
	
	@PostMapping("/add")
    public Charge add(@RequestBody Charge charge){
		System.out.println(": "+charge.getFournisseur());
    	return chargeService.SaveCharge(charge);
          
    }
	 @GetMapping("/days/{d}")
	    public List<Object> Seven(@PathVariable(value = "d") int d)
	    {    
	    	return chargeService.getfilter(d);   
	    }
	 @GetMapping("/sum/days/{d}")
	    public List<Object> gain(@PathVariable(value = "d") int d)
	    {    
	    	return chargeService.gain(d);   
	    }
	 //@CrossOrigin(origins = "https://fellah-back.herokuapp.com")
	 @GetMapping("/sum")
	    public Long Summ()
	    {    
	    	return chargeService.summ();   
	    }
}