package com.example.TestDB.model;

	import java.io.Serializable;
    import java.sql.Timestamp;


	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
	import javax.persistence.Table;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;


	@Entity
	@Table(name = "Company")
	public class Company extends W_User implements Serializable {
	 private static final long serialVersionUID = -3009157732242241606L;
	   
	   @Id
	   
	   @Column(name = "cr", unique=true, nullable = false)
	  @NotNull(message = "cr cannot be Empty ")
	   private String cr;
	   

	   @Column(name = "CompanyName", nullable = false)
	  @NotNull(message = "CompanyName cannot be Empty ")
	   private String CompanyName;

	   @Column(name = "StartDate", nullable = false)
	  @NotNull(message = "StartDate cannot be Empty ")
	   private Timestamp StartDate;

	  
	   @Column(name = "EndDate", nullable = false)
	  @NotNull(message = "EndDate cannot be Empty ")
	   private Timestamp EndDate;

	 
	   public Company() {
		super();
		
	}
	@Builder
	   

	public Company(String Email, String Phonenumber, String Address, String Password, String cr, String companyName,
			Timestamp StartDate, Timestamp EndDate) {
		super(Email, Phonenumber, Address, Password);
		this.cr = cr;
		CompanyName = companyName;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	
	
	   
	 public String getcr() {
	  return cr;
	 }
	 public void setCr(String cr) {
	  this.cr = cr;
	 }
	 public String getCompanyName() {
	  return CompanyName;
	 }
	 public void setCompanyName(String CompanyName) {
	  this.CompanyName = CompanyName;
	 }
	
	 public Timestamp getStartDate() {
	  return StartDate;
	 }
	 public void setStartDate(Timestamp StartDate) {
	  this.StartDate = StartDate;
	 }
	 public Timestamp getEndDate() {
	  return EndDate;
	 }
	 public void setEndDate(Timestamp EndDate) {
	  this.EndDate = EndDate;
	 }
	  
	@Override
	public String toString() {
		return "Company [cr=" + cr + ", CompanyName=" + CompanyName + ", StartDate=" + StartDate + ", EndDate="
				+ EndDate + ", toString()=" + super.toString() + "]";
	}

	}
