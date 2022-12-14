package com.fellah.api.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellah.api.model.Client;
import com.fellah.api.repository.ClientRepository;
@Service
public class ClientImpService implements ClientService {

	 @Autowired
	    private ClientRepository cr;
	@Override
	public Client saveClient(Client client) {
		
		return cr.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		return cr.findAll();
	}

	@Override
	public List<Object> getLastSevenDays(int d) {
	   	LocalDate today=LocalDate.now();

		 LocalDate sevenDaysAgoDate = LocalDate.now().minusDays(d);
	        return this.cr.sevendays(sevenDaysAgoDate,today);

	}
	

	@Override
	public Client update(Long id, Client client) {
		 if (cr.findById(id).isPresent()){
	            Client c = cr.findById(id).get();
	            if(client.getNom()=="" || client.getPrenom()=="" || client.getAdresse()=="" || client.getTel()==0 
	      ) {
	            	return c;
	            }
	            c.setNom(client.getNom());
	            c.setPrenom(client.getPrenom());
	            c.setAdresse(client.getAdresse());
	            c.setTel(client.getTel());
	            Client clt= cr.save(client);

	            return clt;
	        }else{
	            return null;
	        }
	}

	@Override
	public void delete(Long id) {
			cr.deleteById(id);
	}

	@Override
	public Long allClt() {
		return cr.all();
	}

	@Override
	public Client findkarim(Long id) {
		return cr.findkarim(id);
		
	}

}
