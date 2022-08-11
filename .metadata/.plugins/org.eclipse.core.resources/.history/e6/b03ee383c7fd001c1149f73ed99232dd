package com.fellah.api.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Veterinaire {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private int telephone;
	@OneToMany
	ArrayList<Visite> visiteList;
	@OneToMany
	ArrayList<Medicament> medicamentList;
	public Veterinaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Veterinaire(int id, String nom, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.telephone = telephone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
}
