package com.example.TestDB.dto;

import java.sql.Timestamp;

public class CompanyDTO  extends W_UserDTO {
	  private String cr;
	  private String CompanyName;
	  private Timestamp StartDate;
	  private Timestamp EndDate;
	  
	  
	  
	  
	  
	public CompanyDTO() {
		super();
		
		
	}

	public CompanyDTO(String Email, String PhoneNumber, String Address, String Password, String cr, String CompanyName,
			Timestamp StartDate, Timestamp EndDate) {
		super(Email, PhoneNumber, Address, Password);
		this.cr = cr;
		this.CompanyName = CompanyName;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	
	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Timestamp getStartDate() {
		return StartDate;
	}
	public void setStartDate(Timestamp startDate) {
		StartDate = startDate;
	}
	public Timestamp getEndDate() {
		return EndDate;
	}
	public void setEndDate(Timestamp endDate) {
		EndDate = endDate;
	}
	  
}
