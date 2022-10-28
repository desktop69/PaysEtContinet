package com.saad.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.saad.pays.entities.*;
import com.saad.pays.entities.Continent;
@RepositoryRestResource(path = "rest")
public interface ContinentRepository extends JpaRepository<Continent, Long> {
	

}
