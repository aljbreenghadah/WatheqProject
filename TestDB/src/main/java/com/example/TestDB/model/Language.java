package com.example.TestDB.model;

	import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	//import javax.persistence.GeneratedValue;
//	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

import lombok.Builder;


	@Entity
	@Table(name = "language")
	public class Language implements Serializable {
	 private static final long serialVersionUID = -3009157732242241606L;
	  @Id
	 // @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  

	   
	
	  @Column(name = "languge_ID", nullable = false)
	  private String languge_ID;
	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false ,   cascade= CascadeType.ALL)
	  @JoinColumn(name="NationalID",nullable=false)
	  private Individual NationalID; 
	 
	 
	   @Column(name = "languge_name", nullable = false)
	   private String languge_name;
	  

	   @Column(name = "languge_date", nullable = false)
	
	   private Timestamp languge_date;
	   
	   
	   @Column(name = "languge_attach", nullable = false)
	   private String languge_attach;
	   



	public Language() {
		super();
	}
	
	@Builder



	

	public Language(long id, String languge_ID, Individual NationalID, String languge_name, Timestamp languge_date,
			String languge_attach) {
		super();
		this.id = id;
		this.languge_ID = languge_ID;
    	this.NationalID = NationalID;
		this.languge_name = languge_name;
		this.languge_date = languge_date;
		this.languge_attach = languge_attach;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguge_ID() {
		return languge_ID;
	}

	public void setLanguge_ID(String languge_ID) {
		this.languge_ID = languge_ID;
	}

	public Individual getNationalID() {
		return NationalID;
	}

	public void setNationalID(Individual nationalID) {
		NationalID = nationalID;
	}

	public String getLanguge_name() {
		return languge_name;
	}

	public void setLanguge_name(String languge_name) {
		this.languge_name = languge_name;
	}

	public Timestamp getLanguge_date() {
		return languge_date;
	}

	public void setLanguge_date(Timestamp languge_date) {
		this.languge_date = languge_date;
	}

	public String getLanguge_attach() {
		return languge_attach;
	}

	public void setLanguge_attach(String languge_attach) {
		this.languge_attach = languge_attach;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", languge_ID=" + languge_ID + ", NationalID=" + NationalID + ", languge_name="
				+ languge_name + ", languge_date=" + languge_date + ", languge_attach=" + languge_attach
				+ ", toString()=" + super.toString() + "]";
	}


	}

