package com.saad.conference;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.intg.conference.repos.ConferenceRepository;
import com.intg.conference.entities.Conference;




@SpringBootTest
class SpringfinalprojectApplicationTests {

	@Autowired
	private ConferenceRepository payRepository;
	
	
	
	@Test
	public void testFindPay()
	{
	Conference p = payRepository.findById(1L).get();

	System.out.println(p);
	}
	
	@Test
	public void testListerTousProduits()
	{
	List<Conference> prods = payRepository.findAll();
	for (Conference p : prods)
	{
	System.out.println(p);
	}

	}
	
	
	
	
	
	@Test
	void thisisasimpletest() {
		System.out.println("test working");
	}

}
