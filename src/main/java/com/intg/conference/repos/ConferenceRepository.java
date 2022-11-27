package com.intg.conference.repos;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.intg.conference.entities.Conference;
@RepositoryRestResource(path = "rest")
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
	
	
}
