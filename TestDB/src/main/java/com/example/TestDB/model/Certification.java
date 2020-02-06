package com.example.TestDB.model;

	import java.io.Serializable;
    import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import lombok.Builder;

		@Entity
		@Table(name = "Certification")
		public class Certification implements Serializable {

		  private static final long serialVersionUID = -3009157732242241606L;
		  
		  @Id
		  
		
		  @Column(name = "CERT_id", nullable = false)
			 private String CERT_id;
		  
		  @ManyToOne(fetch=FetchType.LAZY,optional=false ,    cascade= CascadeType.ALL)
	      @JoinColumn(name="NationalID",nullable=false)
	      private Individual NationalID; 
		  
		 
		  @Column(name = "UNI_NAME", nullable = false)
		  @NotNull(message = "UNI_NAME cannot be Empty ")
		  private String UNI_NAME;
		 
		 
		  @Column(name = "ADDBY", nullable = false)
		  @NotNull(message = "ADDBY cannot be Empty ")
		  private String ADDBY; 
		  
		  
		 
		  @Column(name = "CERT_DATE", nullable = false)
		  @NotNull(message = "CERT_DATE cannot be Empty ")
		 private Timestamp CERT_DATE;
		  
		  
		
		  @Column(name = "GPA", nullable = false)
		  @NotNull(message = "GPA cannot be Empty ")
			 private double GPA ;
		  
		  
		
		  @Column(name = "DEGREE", nullable = false)
		  @NotNull(message = "DEGREE cannot be Empty ")
			 private String DEGREE;
		  
		  
		 
		  @Column(name = "MAJOR", nullable = false)
		  @NotNull(message = "MAJOR cannot be Empty ")
			 private String MAJOR;
		  
		  
	
		  @Column(name = "ATTACH", nullable = false)
		  @NotNull(message = "ATTACH cannot be Empty ")
			 private String ATTACH;
		  
		  public Certification() {
		  }
		  
		  @Builder


		public Certification(String CERT_id, Individual NationalID, String UNI_NAME, String ADDBY, Timestamp CERT_DATE,
				double GPA, String DEGREE, String MAJOR, String ATTACH) {
			super();
			this.CERT_id = CERT_id;
			this.NationalID = NationalID;
			this.UNI_NAME = UNI_NAME;
			this.ADDBY = ADDBY;
			this.CERT_DATE = CERT_DATE;
			this.GPA = GPA;
			this.DEGREE = DEGREE;
			this.MAJOR = MAJOR;
			this.ATTACH = ATTACH;
		}


		public String getCERT_id() {
			return CERT_id;
		}


		public void setCERT_id(String cERT_id) {
			CERT_id = cERT_id;
		}


		public Individual getNationalID() {
			return NationalID;
		}


		public void setNationalID(Individual nationalID) {
			NationalID = nationalID;
		}


		public String getUNI_NAME() {
			return UNI_NAME;
		}


		public void setUNI_NAME(String uNI_NAME) {
			UNI_NAME = uNI_NAME;
		}


		public String getADDBY() {
			return ADDBY;
		}


		public void setADDBY(String aDDBY) {
			ADDBY = aDDBY;
		}


		public Timestamp getCERT_DATE() {
			return CERT_DATE;
		}


		public void setCERT_DATE(Timestamp cERT_DATE) {
			CERT_DATE = cERT_DATE;
		}


		public double getGPA() {
			return GPA;
		}


		public void setGPA(double gPA) {
			GPA = gPA;
		}


		public String getDEGREE() {
			return DEGREE;
		}


		public void setDEGREE(String dEGREE) {
			DEGREE = dEGREE;
		}


		public String getMAJOR() {
			return MAJOR;
		}


		public void setMAJOR(String mAJOR) {
			MAJOR = mAJOR;
		}


		public String getATTACH() {
			return ATTACH;
		}


		public void setATTACH(String aTTACH) {
			ATTACH = aTTACH;
		}


		@Override
		public String toString() {
			return "Certification [CERT_id=" + CERT_id + ", NationalID=" + NationalID + ", UNI_NAME=" + UNI_NAME
					+ ", ADDBY=" + ADDBY + ", CERT_DATE=" + CERT_DATE + ", GPA=" + GPA + ", DEGREE=" + DEGREE
					+ ", MAJOR=" + MAJOR + ", ATTACH=" + ATTACH + ", toString()=" + super.toString() + "]";
		}



		}

