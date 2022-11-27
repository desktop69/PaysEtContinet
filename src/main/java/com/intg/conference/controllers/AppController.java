package com.intg.conference.controllers;

import java.io.Console;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.intg.conference.service.ConferenceService;
import com.intg.conference.entities.Conference;




@Controller
public class AppController {
	@Autowired
	ConferenceService paysService;
	
	
	

}
