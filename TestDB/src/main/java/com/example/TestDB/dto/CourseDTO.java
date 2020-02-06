package com.example.TestDB.dto;

import java.sql.Timestamp;

//import javax.persistence.Column;

import com.example.TestDB.model.Company;
import com.example.TestDB.model.Education;
import com.example.TestDB.model.Individual;

public class CourseDTO {
	 private String courseID;
	  private Individual NationalID;
	  private Education Eduid; 
	  private Company cr ;
		   private String nameCourse;
		   private String addedBy;
		   private String nameInstittion;
		   private String courseAttch;
			   private Timestamp StartDate;
			   private Timestamp EndDate;
			   
	  
	  
	  
	public CourseDTO() {
		super();
	}




	public CourseDTO(String courseID, Individual nationalID, Education eduid, Company cr, String nameCourse,
			String addedBy, String nameInstittion, String courseAttch, Timestamp startDate, Timestamp endDate) {
		super();
		this.courseID = courseID;
		NationalID = nationalID;
		Eduid = eduid;
		this.cr = cr;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.nameInstittion = nameInstittion;
		this.courseAttch = courseAttch;
		StartDate = startDate;
		EndDate = endDate;
	}




	public String getCourseID() {
		return courseID;
	}




	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}




	public Individual getNationalID() {
		return NationalID;
	}




	public void setNationalID(Individual nationalID) {
		NationalID = nationalID;
	}




	public Education getEduid() {
		return Eduid;
	}




	public void setEduid(Education eduid) {
		Eduid = eduid;
	}




	public Company getCr() {
		return cr;
	}




	public void setCr(Company cr) {
		this.cr = cr;
	}




	public String getNameCourse() {
		return nameCourse;
	}




	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}




	public String getAddedBy() {
		return addedBy;
	}




	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}




	public String getNameInstittion() {
		return nameInstittion;
	}




	public void setNameInstittion(String nameInstittion) {
		this.nameInstittion = nameInstittion;
	}




	public String getCourseAttch() {
		return courseAttch;
	}




	public void setCourseAttch(String courseAttch) {
		this.courseAttch = courseAttch;
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