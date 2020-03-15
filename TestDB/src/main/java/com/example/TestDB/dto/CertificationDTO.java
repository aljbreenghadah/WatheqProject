package com.example.TestDB.dto;

import java.util.Date;

import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;

public class CertificationDTO {
	     private String CERT_id;
	     private Individual NationalID;
	 	private Education Edu_iD;
	     private Education EDU_NAME;
	     private String ADDBY;
	     private Date CERT_DATE;
	     private Double GPA;
		 private String DEGREE;
		 private String MAJOR;
		 private String ATTACH;
		 
		 
		 
		 
		public CertificationDTO() {
			
		}













		public CertificationDTO(String cERT_id, Individual nationalID, Education edu_iD, Education eDU_NAME,
				String aDDBY, Date cERT_DATE, Double gPA, String dEGREE, String mAJOR, String aTTACH) {
			super();
			CERT_id = cERT_id;
			NationalID = nationalID;
			Edu_iD = edu_iD;
			EDU_NAME = eDU_NAME;
			ADDBY = aDDBY;
			CERT_DATE = cERT_DATE;
			GPA = gPA;
			DEGREE = dEGREE;
			MAJOR = mAJOR;
			ATTACH = aTTACH;
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




		public Education getEdu_iD() {
			return Edu_iD;
		}




		public void setEdu_iD(Education edu_iD) {
			Edu_iD = edu_iD;
		}







		public Education getEDU_NAME() {
			return EDU_NAME;
		}







		public void setEDU_NAME(Education eDU_NAME) {
			EDU_NAME = eDU_NAME;
		}







		public String getADDBY() {
			return ADDBY;
		}




		public void setADDBY(String aDDBY) {
			ADDBY = aDDBY;
		}




		public Date getCERT_DATE() {
			return CERT_DATE;
		}




		public void setCERT_DATE(Date cERT_DATE) {
			CERT_DATE = cERT_DATE;
		}




		public Double getGPA() {
			return GPA;
		}




		public void setGPA(Double gPA) {
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
