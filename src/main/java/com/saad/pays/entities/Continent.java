package com.saad.pays.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Continent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomcont;
	private long km;
	private String population;
	
	@JsonIgnore
	@OneToMany(mappedBy = "continent")
	private List<Pays> pays;

	public Continent(String nomcont, long km, String population, List<Pays> pays) {
		super();
		this.nomcont = nomcont;
		this.km = km;
		this.population = population;
		this.pays = pays;
	}

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getNomcont() {
		return nomcont;
	}

	public void setNomcont(String nomcont) {
		this.nomcont = nomcont;
	}

	public long getKm() {
		return km;
	}

	public void setKm(long km) {
		this.km = km;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public List<Pays> getPays() {
		return pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Continent [idCat=" + idCat + ", nomcont=" + nomcont + ", km=" + km + ", population=" + population
				+ ", pays=" + pays + "]";
	}

	public Continent() {
		super();
	}
	


}
