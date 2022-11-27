package com.intg.conference.service;

import java.util.List;




import com.intg.conference.entities.Conference;


public interface ConferenceService {	
	Conference saveConference(Conference c);	
	Conference updateConference(Conference c);		
	void deleteConference(Conference c);
	void deleteConferenceById(Long id);
	Conference getConference(Long id);
	List<Conference> getAllConference();
	List<Conference> findByNomConferenceLike(String nom);
	

}
