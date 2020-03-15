package com.example.TestDB.model;

	import java.io.Serializable;
    import java.util.Date;
    import javax.persistence.CascadeType;
    import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import com.example.TestDB.model.Course.CourseBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
       @NoArgsConstructor
		@Entity
		@Table(name = "Certification")
		public class Certification implements Serializable {

		  private static final long serialVersionUID = -3009157732242241606L;
		  
		  @Id
		  
		
		  @Column(name = "CERT_id",unique=true, nullable = false)
			 private String CERT_id;
		  
		  @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
			@JoinColumn(name = "NationalID")
			private Individual NationalID;
		  
			@ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
			@JoinColumn(name = "Edu_iD")
			private Education Edu_iD;
			
			@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
			@JoinColumn(name = "EDU_NAME")
			private Education EDU_NAME;

		 
		  @Column(name = "ADDBY", nullable = false)
		  @NotNull(message = "Should insert who add the certificate ")
		  private String ADDBY; 
		  
		  
		 
		  @Column(name = "CERT_DATE", nullable = false)
		  @NotNull(message = "the date of certificate cannot be Empty")
		 private Date CERT_DATE;
		  
		  
		
		  @Column(name = "GPA", nullable = false)
		  @NotNull(message = "GPA cannot be Empty ")
			 private Double GPA ;
		  
		  
		
		  @Column(name = "DEGREE", nullable = false)
		  @NotNull(message = "DEGREE cannot be Empty ")
			 private String DEGREE;
		  
		  
		 
		  @Column(name = "MAJOR", nullable = false)
		  @NotNull(message = "MAJOR cannot be Empty ")
			 private String MAJOR;
		  
		  
	
		  @Column(name = "ATTACH", nullable = false)
		  @NotNull(message = "ATTACH cannot be Empty ")
			 private String ATTACH;
		  

	



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


		public double getGPA() {
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


		@Override
		public String toString() {
			return "Certification [CERT_id=" + CERT_id + ", NationalID=" + NationalID 
					+ ", ADDBY=" + ADDBY + ", CERT_DATE=" + CERT_DATE + ", GPA=" + GPA + ", DEGREE=" + DEGREE
					+ ", MAJOR=" + MAJOR + ", ATTACH=" + ATTACH + ", toString()=" + super.toString() + "]";
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


		public void setGPA(double gPA) {
			GPA = gPA;
		}

		 @Builder
		public Certification(String cERT_id, Individual nationalID, Education edu_iD, Education eDU_NAME,
				@NotNull(message = "Should insert who add the certificate ") String aDDBY,
				@NotNull(message = "the date of certificate cannot be Empty") Date cERT_DATE,
				@NotNull(message = "GPA cannot be Empty ") Double gPA,
				@NotNull(message = "DEGREE cannot be Empty ") String dEGREE,
				@NotNull(message = "MAJOR cannot be Empty ") String mAJOR,
				@NotNull(message = "ATTACH cannot be Empty ") String aTTACH) {
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



		}

