package com.kpjavaspringboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
//@Table(name="city")
public class Card {

	@Id
    int id = 0;
	
	@Column(name="Name")
    String name = "";   
	
    @Column(name="CountryCode")
    String countryCode = "";
    
    @Column(name="District")
    String disrtict = "";	
    
    @Column(name="Population")
    Integer population = 0;
            
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public Card(int id, String name, String countryCode, String disrtict, Integer population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.disrtict = disrtict;
		this.population = population;
	}


	public void display() {
		System.out.println("KP : KPJavaSpringBootApplication - @Component : City Model - display()");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDisrtict() {
		return disrtict;
	}

	public void setDisrtict(String disrtict) {
		this.disrtict = disrtict;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}


	
}
