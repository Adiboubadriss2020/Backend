package com.fellah.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellah.api.model.Fournisseur;
import com.fellah.api.repository.FournisseurRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class FournisseurServiceImp implements FournisseurService {


    @Autowired
    private FournisseurRepository fr;

	@Override
	public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fr.save(fournisseur);
        	
	}

	@Override
	public List<Fournisseur> getAllFournisseurs() {
        return fr.findAll();

	}

	@Override
	public List<Object> getLastSevenDays(int d) {
	   	LocalDate today=LocalDate.now();

		 LocalDate sevenDaysAgoDate = LocalDate.now().minusDays(d);
	        return this.fr.sevendays(sevenDaysAgoDate,today);

	}
	

	@Override
	public Fournisseur findkarim(Long id) {
		return fr.findkarim(id);
	}

	@Override
    public Fournisseur updateFr(Long id, Fournisseur f) {

        if (fr.findById(id).isPresent()){
            Fournisseur existingF = fr.findById(id).get();
            if(f.getNom() ==""||  f.getEmail()=="" || f.getAdresse()=="") {
            	return existingF  ;  
       }
            existingF.setNom(f.getNom());
            existingF.setEmail(f.getEmail());
            existingF.setAdresse(f.getAdresse());
            existingF.setCommercial(f.getCommercial());
         

            Fournisseur updatedF = fr.save(existingF);

            return new Fournisseur(updatedF.getId(), updatedF.getNom(),
                    updatedF.getEmail(), updatedF.getAdresse(),updatedF.getCommercial());
        }else{
            return null;
        }
    }


	@Override
	public void delete(Long id) {
		fr.deleteById(id);
		
	}

	@Override
	public Long allF() {
		return fr.all();
	}

	@Override
	public Fournisseur update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fournisseur> getnom() {
		return fr.nom();
		
	}
}
