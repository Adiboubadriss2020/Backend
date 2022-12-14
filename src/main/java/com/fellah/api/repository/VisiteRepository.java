package com.fellah.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fellah.api.model.Visite;

public interface VisiteRepository extends JpaRepository<Visite, Long> {

	 @Query(value="select vi.date_visite,sum(vi.prix_visite) from Visite vi where vi.date_visite between ?1 and ?2  group by vi.date_visite order by vi.date_visite ",
	    		nativeQuery = true)	    	 
	List<Object> sevendays(LocalDate sevenDaysAgoDate, LocalDate today);
}
 