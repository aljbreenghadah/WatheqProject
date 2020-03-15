package com.example.TestDB.model;

	import java.io.Serializable;
    import java.util.Date;
    import javax.persistence.Column;
	import javax.persistence.Entity;
    import javax.persistence.Id;
//import javax.persistence.Id;
	import javax.persistence.Table;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
    import javax.validation.constraints.NotNull;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.NoArgsConstructor;

     @NoArgsConstructor
     @AllArgsConstructor
   	@Entity
	@Table(name = "Company")
	public class Company extends W_User implements Serializable {
	 private static final long serialVersionUID = -3009157732242241606L;
	   
	   @Id
	   
	   @Column(name = "cr", unique=true, nullable = false)
	  @NotNull(message = "cr cannot be Empty ")
	   private String cr;
	   

	   @Column(name = "CompanyName",unique=true, nullable = false)
	  @NotNull(message = "CompanyName cannot be Empty ")
	   private String CompanyName;

	   @Column(name = "StartDate", nullable = false)
	
	   private Date StartDate;

	  
	   @Column(name = "EndDate", nullable = false)

	   private Date EndDate;

	 
		public Company(String companyName) {
			this.CompanyName = companyName;
		
	}
	@Builder
	   

	public Company(String Email, String Phonenumber, String Address, String Password, String cr, String companyName,
			Date StartDate, Date EndDate) {
		super(Email, Phonenumber, Address, Password);
		this.cr = cr;
		CompanyName = companyName;
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
	@Override
	public String toString() {
		return "Company [cr=" + cr + ", CompanyName=" + CompanyName + ", StartDate=" + StartDate + ", EndDate="
				+ EndDate + "]";
	}
}

