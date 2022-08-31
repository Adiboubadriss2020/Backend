package com.fellah.api.service;

	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fellah.api.model.Account;
import com.fellah.api.repository.AccounRepository;
@Service
public class AccountImpService implements AccountService {
	@Autowired
    private AccounRepository a;
	private PasswordEncoder passwordEncoder;
	@Override
	public Account saveAccount(Account account) {
		this.passwordEncoder= new BCryptPasswordEncoder();
		String encoded=passwordEncoder.encode(account.getMotdepasse());
		account.setMotdepasse(encoded);
		return a.save(account);
	}

	@Override
	public Account getacc(String e) {
		return a.getA(e);
	}

	@Override
	public Account getac(String e,String p) {
		this.passwordEncoder= new BCryptPasswordEncoder();
		if(a.getA(e)==null) {
			return null;
		}
		else {
		Account r= a.getA(e);
		if(passwordEncoder.matches(p, r.getMotdepasse())) {
			return r;
		}
		else {
			return null;
		}
		}
	}
		

}
