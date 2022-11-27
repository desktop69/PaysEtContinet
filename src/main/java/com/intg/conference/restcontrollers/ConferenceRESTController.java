package com.intg.conference.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intg.conference.entities.*;
import com.intg.conference.service.*;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class ConferenceRESTController {
	@Autowired
	ConferenceService conferenceService;
	//select *
	@RequestMapping(method = RequestMethod.GET)
	public List<Conference> getAllConference(){
		return conferenceService.getAllConference();
	}
	
	// select with id 
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public Conference getConference(@PathVariable("id") Long id) {
		return conferenceService.getConference(id);
		}
		// insert *
		@RequestMapping(method = RequestMethod.POST)
		public Conference saveConference(@RequestBody Conference con) {
			return conferenceService.saveConference(con);
		}
		
		// update *
		@RequestMapping(method = RequestMethod.PUT)
		public Conference updatePays (@RequestBody Conference con) {
			return conferenceService.updateConference(con);
		}
		
		//Delete id*
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteConference(@PathVariable("id") Long id) {
			conferenceService.deleteConferenceById(id);
		}
		
		
		
		
		
		
		
		
}
