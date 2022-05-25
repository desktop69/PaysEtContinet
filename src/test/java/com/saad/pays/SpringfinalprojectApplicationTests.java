package com.saad.pays;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.saad.pays.entities.Continent;
import com.saad.pays.entities.Pays;
import com.saad.pays.repos.PayRepository;




@SpringBootTest
class SpringfinalprojectApplicationTests {

	@Autowired
	private PayRepository payRepository;
	
	@Test
	public void testCreateProduit() {
	Pays prod = new Pays(null, "la france", "5000", 0, null);
	payRepository.save(prod);
	}
	
	@Test
	public void testFindPay()
	{
	Pays p = payRepository.findById(1L).get();

	System.out.println(p);
	}
	
	@Test
	public void testListerTousProduits()
	{
	List<Pays> prods = payRepository.findAll();
	for (Pays p : prods)
	{
	System.out.println(p);
	}

	}
	
	
	
	
	
	@Test
	void thisisasimpletest() {
		System.out.println("test working");
	}

}
