package com.example.TestDB.dto;

import java.sql.Timestamp;

import com.example.TestDB.model.Individual;

public class CertificationDTO {
	     private String CERT_id;
	     private Individual NationalID;
	     private String UNI_NAME;
	     private String ADDBY;
	     private Timestamp CERT_DATE;
	     private double GPA;
		 private String DEGREE;
		 private String MAJOR;
		 private String ATTACH;
		 
		 
		 
		 
		public CertificationDTO() {
			super();
			
			
			
		}
		public CertificationDTO(String CERT_id, Individual NationalID, String UNI_NAME, String ADDBY,
				Timestamp CERT_DATE, double GPA, String DEGREE, String MAJOR, String ATTACH) {
			super();
			this.CERT_id = CERT_id;
			this.NationalID = NationalID;
			this.UNI_NAME = UNI_NAME;
			this.ADDBY =ADDBY;
			this.CERT_DATE = CERT_DATE;
			this.GPA = GPA;
			this.DEGREE =DEGREE;
			this.MAJOR =MAJOR;
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
}