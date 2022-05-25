package com.saad.pays.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPay;
	private String nomPay;
	private String Langues;
	private int Gouvernorat;
	
	@ManyToOne
	private Continent continent;
	
	
}
