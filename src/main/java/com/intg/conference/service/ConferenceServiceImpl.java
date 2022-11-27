package com.intg.conference.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.intg.conference.repos.ConferenceRepository;
import com.intg.conference.entities.Conference;


@Service
public class ConferenceServiceImpl implements ConferenceService {
	@Autowired
	ConferenceRepository conferenceRepository;

	@Override
	public Conference saveConference(Conference c) {
		
		return conferenceRepository.save(c);
	}

	@Override
	public Conference updateConference(Conference c) {
		
		return conferenceRepository.save(c);
	}

	@Override
	public void deleteConference(Conference c) {
		conferenceRepository.delete(c);
	}

	@Override
	public void deleteConferenceById(Long id) {
		conferenceRepository.deleteById(id);
		
	}

	@Override
	public Conference getConference(Long id) {
		// TODO Auto-generated method stub
		return conferenceRepository.findById(id).get();
	}

	@Override
	public List<Conference> getAllConference() {
		return conferenceRepository.findAll();
	}

	@Override
	public List<Conference> findByNomConferenceLike(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
