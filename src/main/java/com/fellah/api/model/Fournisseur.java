package com.fellah.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "fournisseur")
public class Fournisseur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "email")
	private String email;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "transaction")
	private long transaction;
	@Column(name = "date")
	private Date date;
	
	public Fournisseur(Long id, String nom, String email, String adresse,long transactionn,Date date) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.transaction=transaction;
		this.date=date;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public long getTransaction() {
		return transaction;
	}
	public void setTransaction(long transaction) {
		this.transaction = transaction;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
