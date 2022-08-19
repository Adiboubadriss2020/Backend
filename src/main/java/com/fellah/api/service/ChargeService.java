package com.fellah.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fellah.api.model.Alimentation;
import com.fellah.api.model.Animal;
import com.fellah.api.model.Client;
import com.fellah.api.model.Employee;
import com.fellah.api.model.Fournisseur;
import com.fellah.api.model.Veterinaire;
import com.fellah.api.model.Visite;
@Service
public interface ChargeService {

	public void SaveCharge(LocalDate today,Alimentation alimentation,Animal animal,Client client,Employee employee,Fournisseur fournisseur,Veterinaire veterinaire,Visite visite);
	public List<Object> getfilter(int d);
}
