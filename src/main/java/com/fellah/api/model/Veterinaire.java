package com.fellah.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veterinaire")
public class Veterinaire {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private String nom;
	@Column(name = "telephone")
	private int telephone;

	
	
	public Veterinaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Veterinaire(Long id, String nom, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.telephone = telephone;
	}
	public Long  getId() {
		return id;
	}
	public void setId(Long id) {
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
