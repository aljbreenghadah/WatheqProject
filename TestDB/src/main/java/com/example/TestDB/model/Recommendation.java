package com.example.TestDB.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//	import javax.persistence.GeneratedValue;
//	import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Builder;

	@Entity
	@Table(name = "Recommendation")
	public class Recommendation implements Serializable {
	 
	  private static final long serialVersionUID = -3009157732242241606L;
	  
	  //Recommendation ID
	  @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private long Reco_id;
	  
	

	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false ,   cascade= CascadeType.ALL)
	  @JoinColumn(name="NationalID",nullable=false )
	  private Individual NationalID; 

	  @ManyToOne(fetch=FetchType.LAZY,optional=false ,   cascade= CascadeType.ALL)
		@JoinColumn(name="Eduid",nullable=false)
		private Education Eduid; 

		@ManyToOne(fetch=FetchType.LAZY,optional=false ,    cascade= CascadeType.ALL)
		@JoinColumn(name="cr",nullable=false)
		private Company cr ;
	  
	  //Person who write it
	
	  @Column(name = "Reco_From", nullable = false)
		@NotNull(message = "Recommendation from cannot be Empty ")
	  private String Reco_From;
	  
	  //Recommendation Creation date
		@NotNull(message = " cannot be Empty ")
	  @Column(name = "Reco_Date", nullable = false)
		@NotNull(message = "Recommendation Date cannot be Empty ")
	  private Date Reco_Date;
	  
	  //User Who added Recommendation 
	
	  @Column(name = "Reco_AddBy", nullable = false)
	  private String Reco_AddBy;
	  
	  //URL Recommendation attachment
	
	  @Column(name = "Reco_Attach", nullable = false)
		@NotNull(message = "Reco_Attach cannot be Empty ")
	  private String Reco_Attach;
	  
	  //The name of the institute Who added Recommendation 
		
	  @Column(name = "Reco_Institute_Name", nullable = false)
	  @NotNull(message = "Reco_Institute_Name  cannot be Empty ")
	  private String Reco_Institute_Name;
	  
	 
	  public Recommendation() {
	  }

	  @Builder

	public Recommendation(long Reco_id, Individual NationalID, Education Eduid, Company cr, String Reco_From,
			Date Reco_Date, String Reco_AddBy, String Reco_Attach, String Reco_Institute_Name) {
		super();
		this.Reco_id = Reco_id;
		this.NationalID = NationalID;
		this.Eduid = Eduid;
		this.cr = cr;
		this.Reco_From = Reco_From;
		this.Reco_Date = Reco_Date;
		this.Reco_AddBy = Reco_AddBy;
		this.Reco_Attach = Reco_Attach;
		this.Reco_Institute_Name = Reco_Institute_Name;
	}


	public long getReco_id() {
		return Reco_id;
	}

	public void setReco_id(long reco_id) {
		Reco_id = reco_id;
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

	public String getReco_From() {
		return Reco_From;
	}

	public void setReco_From(String reco_From) {
		Reco_From = reco_From;
	}

	public Date getReco_Date() {
		return Reco_Date;
	}

	public void setReco_Date(Date reco_Date) {
		Reco_Date = reco_Date;
	}

	public String getReco_AddBy() {
		return Reco_AddBy;
	}

	public void setReco_AddBy(String reco_AddBy) {
		Reco_AddBy = reco_AddBy;
	}

	public String getReco_Attach() {
		return Reco_Attach;
	}

	public void setReco_Attach(String reco_Attach) {
		Reco_Attach = reco_Attach;
	}

	public String getReco_Institute_Name() {
		return Reco_Institute_Name;
	}

	public void setReco_Institute_Name(String reco_Institute_Name) {
		Reco_Institute_Name = reco_Institute_Name;
	}

	@Override
	public String toString() {
		return "Recommendation [Reco_id=" + Reco_id + ", NationalID=" + NationalID + ", Eduid=" + Eduid + ", cr=" + cr
				+ ", Reco_From=" + Reco_From + ", Reco_Date=" + Reco_Date + ", Reco_AddBy=" + Reco_AddBy
				+ ", Reco_Attach=" + Reco_Attach + ", Reco_Institute_Name=" + Reco_Institute_Name + ", toString()="
				+ super.toString() + "]";
	}
	
	}
	
	
	
	