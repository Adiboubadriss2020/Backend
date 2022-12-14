package com.fellah.api.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visite")
public class Visite {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "date_visite")
	private Date date_visite;
	@Column(name = "medicament")
	private String medicament;
	@Column(name = "prix_medicament")
	private double prix_medicament;
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bovin_id",nullable = true)
    private Animal animal;
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "veterinaire_id",nullable = true)
    private Veterinaire veterinaire;
	
	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visite(Long id, Date date_visite,Animal animal,Veterinaire veterinaire) {
		super();
		this.id = id;
		this.date_visite = date_visite;
		this.animal=animal;
		this.veterinaire=veterinaire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate_visite() {
		return date_visite;
	}
	public void setDate_visite(Date date_visite) {
		this.date_visite = date_visite;
	}

	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Veterinaire getVeterinaire() {
		return veterinaire;
	}
	public void setVeterinaire(Veterinaire veterinaire) {
		this.veterinaire = veterinaire;
	}
	public String getMedicament() {
		return medicament;
	}
	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}
	public double getPrix_medicament() {
		return prix_medicament;
	}
	public void setPrix_medicament(double prix_medicament) {
		this.prix_medicament = prix_medicament;
	}
	
	
}
