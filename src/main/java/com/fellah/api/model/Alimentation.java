package com.fellah.api.model;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alimentation")
public class Alimentation {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique=true)
	private Long ref;
	private String type_alimentation;
	private Date date_arrivage;
	private double quantite_arrivage;

	public Alimentation(Long id,Long ref, String type_alimentation, Date date_arrivage, double quantite_arrivage) {
		super();
		this.id = id;
		this.ref=ref;
		this.type_alimentation = type_alimentation;
		this.date_arrivage = date_arrivage;
		this.quantite_arrivage = quantite_arrivage;
		
	}
	public Alimentation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType_alimentation() {
		return type_alimentation;
	}
	public void setType_alimentation(String type_alimentation) {
		this.type_alimentation = type_alimentation;
	}
	public Date getDate_arrivage() {
		return date_arrivage;
	}
	public void setDate_arrivage(Date date_arrivage) {
		this.date_arrivage = date_arrivage;
	}
	public double getQuantite_arrivage() {
		return quantite_arrivage;
	}
	public void setQuantite_arrivage(double quantite_arrivage) {
		this.quantite_arrivage = quantite_arrivage;
	}
	
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	
	
}
