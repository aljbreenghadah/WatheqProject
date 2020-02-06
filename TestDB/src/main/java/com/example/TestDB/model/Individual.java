package com.example.TestDB.model;

	import java.io.Serializable;
    import java.sql.Timestamp;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
   //import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import lombok.Builder;
  
	@Entity
	@Table(name = "Individual")
	public class Individual extends W_User implements Serializable {
	 
	  private static final long serialVersionUID = -3009157732242241606L;
	  
 	 @Id
	  @Column(name = "NationalID",unique=true, nullable = false)
	  
	  
	  @NotNull(message = "NationalID cannot be Empty ") 
     // @Size(min=10 , max=10)
	  private String NationalID;
	
	
	 
	  @Column(name = "Firstname",nullable = false)
	  @NotNull(message ="Firstname cannot be Empty ")
	  private String FirstName;
	  
	  @Column(name = "MName", nullable = false)
	  @NotNull(message = " MName cannot be Empty ")
	  private String MName;
	  
	  
	  @Column(name = "lastname", nullable = false)
	  @NotNull(message = "lastname cannot be Empty ")
	  private String lastName;
	  
	  @Column(name = "Gender", nullable = false)
	  @NotNull(message = "Gender cannot be Empty ")
	  private Boolean Gender;
	  
	  
	  @NotNull(message = "Status cannot be Empty ")
	  @Column(name = "Status")
	  private String Status;
	  
	 
	  @Column(name = "Skills")
	  private String Skills;
	  
	  
	  @Column(name = "DOB", nullable = false)
	  @NotNull(message = " Date of birth cannot be Empty ")
	  private Timestamp DOB;
	  
	  
	  @Column(name = "MAJOR", nullable = false)
	  @NotNull(message = "MAJOR cannot be Empty ")
	  private String MAJOR;
	  
	  
	  @Column(name = "Attachments")
	  private String Attachments;
	  
	  
      @Column(name = "JOP")
	  private String JOP;









public Individual() {
		super();
	}






@Builder



	public Individual(String Email, String Phonenumber, String Address, String Password, String NationalID,
			String FirstName, String MName, String lastName, Boolean Gender, String Status, String Skills,
			Timestamp DOB, String MAJOR, String Attachments, String JOP) {
		super(Email, Phonenumber, Address, Password);
		this.NationalID = NationalID;
		this.FirstName = FirstName;
		this.MName = MName;
		this.lastName = lastName;
		this.Gender = Gender;
		this.Status = Status;
		this.Skills = Skills;
		this.DOB = DOB;
		this.MAJOR = MAJOR;
		this.Attachments = Attachments;
		this.JOP = JOP;
	}


	public String getNationalID() {
		return NationalID;
	}






	public void setNationalID(String nationalID) {
		NationalID = nationalID;
	}






	public String getFirstName() {
		return FirstName;
	}






	public void setFirstName(String firstName) {
		FirstName = firstName;
	}






	public String getMName() {
		return MName;
	}






	public void setMName(String mName) {
		MName = mName;
	}






	public String getLastName() {
		return lastName;
	}






	public void setLastName(String lastName) {
		this.lastName = lastName;
	}






	public Boolean getGender() {
		return Gender;
	}






	public void setGender(Boolean gender) {
		Gender = gender;
	}






	public String getStatus() {
		return Status;
	}






	public void setStatus(String status) {
		Status = status;
	}






	public String getSkills() {
		return Skills;
	}






	public void setSkills(String skills) {
		Skills = skills;
	}






	public Timestamp getDOB() {
		return DOB;
	}






	public void setDOB(Timestamp dOB) {
		DOB = dOB;
	}






	public String getMAJOR() {
		return MAJOR;
	}






	public void setMAJOR(String mAJOR) {
		MAJOR = mAJOR;
	}






	public String getAttachments() {
		return Attachments;
	}






	public void setAttachments(String attachments) {
		Attachments = attachments;
	}






	public String getJOP() {
		return JOP;
	}






	public void setJOP(String jOP) {
		JOP = jOP;
	}


	@Override
	public String toString() {
		return "Individual [NationalID=" + NationalID + ", FirstName=" + FirstName + ", MName=" + MName + ", lastName="
				+ lastName + ", Gender=" + Gender + ", Status=" + Status + ", Skills=" + Skills + ", DOB=" + DOB
				+ ", MAJOR=" + MAJOR + ", Attachments=" + Attachments + ", JOP=" + JOP + ", toString()="
				+ super.toString() + "]";
	}




}