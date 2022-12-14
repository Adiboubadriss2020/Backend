package com.fellah.api.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.fellah.api.model.Visite;

@Service
public interface VisiteService  {
	public Visite saveVisite(Visite alimentation);
	public List<Visite> getAllVisite();
    public Visite findkarim();
    public Visite update(Long id, Visite a);
    public void delete(Long id);
    public void updatequantity(String type,Long id,String quantite_animal);
	List<Object> getLastSevenDays(int d);

}
