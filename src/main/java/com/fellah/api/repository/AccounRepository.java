package com.fellah.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fellah.api.model.Account;

public interface AccounRepository extends JpaRepository<Account, Long>{
	@Query(value ="select * from Account where email=?1 ",nativeQuery = true)
    Account getA(String e);

	
}
