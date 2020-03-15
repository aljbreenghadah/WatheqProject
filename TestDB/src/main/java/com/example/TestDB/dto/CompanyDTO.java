package com.example.TestDB.dto;

import java.util.Date;

public class CompanyDTO  extends W_UserDTO {
	  private String cr;
	  private String CompanyName;
	  private Date StartDate;
	  private Date EndDate;
	  
	  
	  
	  
	  
	public CompanyDTO() {
		super();
		
		
	}

	public CompanyDTO(String Email, String PhoneNumber, String Address, String Password, String cr, String CompanyName,
			Date StartDate, Date EndDate) {
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
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	  
}
