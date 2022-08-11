package com.fellah.api.model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Animal {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String origine;
	private Long prix_achat;
	private Long poid_achat;
	private Date date_achat;
	private Long poid_vente;
	private Date date_vente;
	@OneToMany
	ArrayList<Alimentation_animal> alimentationanimalList;
	@OneToMany
	ArrayList<Visite> visiteList;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int id, String origine, Long prix_achat, Long poid_achat, Date date_achat, Long poid_vente,
			Date date_vente) {
		super();
		this.id = id;
		this.origine = origine;
		this.prix_achat = prix_achat;
		this.poid_achat = poid_achat;
		this.date_achat = date_achat;
		this.poid_vente = poid_vente;
		this.date_vente = date_vente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public Long getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(Long prix_achat) {
		this.prix_achat = prix_achat;
	}
	public Long getPoid_achat() {
		return poid_achat;
	}
	public void setPoid_achat(Long poid_achat) {
		this.poid_achat = poid_achat;
	}
	public Date getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}
	public Long getPoid_vente() {
		return poid_vente;
	}
	public void setPoid_vente(Long poid_vente) {
		this.poid_vente = poid_vente;
	}
	public Date getDate_vente() {
		return date_vente;
	}
	public void setDate_vente(Date date_vente) {
		this.date_vente = date_vente;
	}

}
