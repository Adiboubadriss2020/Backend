package com.fellah.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fellah.api.model.Veterinaire;
import com.fellah.api.model.Visite;
import com.fellah.api.service.VisiteService;
@RestController
@RequestMapping("/visite")
@CrossOrigin
public class VisiteController {
	 @Autowired
	    private VisiteService VisiteService;

	    @PostMapping("/add")
	    public Visite add(@RequestBody Visite visite){
	    	VisiteService.saveVisite(visite);
	        return visite;
	    }

	    @GetMapping("/getAll")
	    public List<Visite> list(){
	        return VisiteService.getAllVisite();
	    }

	    @DeleteMapping("/delete/{id}")
		public String deleted(@PathVariable(value = "id") Long id) {
	    	VisiteService.delete(id);
			
			return "Deleted!";
		}
	    @PutMapping(value = "update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Visite> updateVeterinaire(@PathVariable(value = "id") Long id,
	                                                         @RequestBody Visite visite){
	        return new ResponseEntity<>(VisiteService.update(id, visite), HttpStatus.OK);
	    }
}
 