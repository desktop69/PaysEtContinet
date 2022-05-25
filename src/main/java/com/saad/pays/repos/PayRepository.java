package com.saad.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.saad.pays.entities.Pays;

public interface PayRepository extends JpaRepository<Pays, Long> {
	
	@Query("select p from Pays p, Continent c where p.continent.idCat = c.idCat and p.continent.nomcont like %:nom%")
	List<Pays> findByNomPays(@Param("nom") String nom);

}
