package com.fellah.api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fellah.api.model.Alimentation_animal;

public interface Alimentation_animalRepository extends JpaRepository<Alimentation_animal, Long> {

	 @Query(value="select a.date_alimentation,sum(a.quantite) from Alimentation_animal a where a.date_alimentation between ?1 and ?2  group by a.date_alimentation order by a.date_alimentation ",
	    		nativeQuery = true)
	    List<Object> almentationquantite(LocalDate threeDaysAgoDate,LocalDate today);
}
