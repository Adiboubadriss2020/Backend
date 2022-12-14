package com.fellah.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fellah.api.model.Alimentation_animal;
import com.fellah.api.service.AlimentationAnimalService;

@RestController
@RequestMapping("/alimentationanimal")
@CrossOrigin
public class AlimentationAnimalController {
	 @Autowired
	    private AlimentationAnimalService alimentationService;

	    @PostMapping("/add")
	    public String add(@RequestBody Alimentation_animal alimentation){
	    	alimentationService.saveAlimentation(alimentation);
	        return "New alimentation is added";
	    }

	    @GetMapping("/getAll")
	    public List<Alimentation_animal> list(){
	        return alimentationService.getAllAlimentationanimal();
	    }
	    @GetMapping("/alimentations/days/{d}")
	    public List<Object> Seven(@PathVariable(value = "d") long d)
	    {    
	    	return alimentationService.controllqnt(d);   
	    }
	    @DeleteMapping("/delete/{id}")
		public String deleted(@PathVariable(value = "id") Long id) {
			alimentationService.delete(id);
			
			return "Deleted!";
		}
}
 