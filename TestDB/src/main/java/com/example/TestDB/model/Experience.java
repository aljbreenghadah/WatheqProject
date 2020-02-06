package com.example.TestDB.model;

	import java.io.Serializable;
    import java.sql.Timestamp;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	//import javax.persistence.GeneratedValue;
	//import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
    import javax.validation.constraints.Max;
    import javax.validation.constraints.Min;
    import javax.validation.constraints.NotNull;
    import lombok.Builder;

	@Entity
	@Table(name = "Experience")
	public class Experience implements Serializable {
	                private static final long serialVersionUID = -3009157732242241606L;

	          	  @NotNull(message = " cannot be Empty ")
	        	  
	         	 @Min(value = 10, message = "Nationa should not be less than 18")
	         	  @Max(value = 10, message = "Nationa should not be greater than 150")
	                @Id
	            //    @GeneratedValue(strategy = GenerationType.AUTO)
	          	  @NotNull(message = " cannot be Empty ")
	                private long Exp_id;
	                
	                @ManyToOne(fetch=FetchType.LAZY,optional=false)
	                @JoinColumn(name="NationalID",nullable=false)
	                private Individual NationalID; 
	                
	                @ManyToOne(fetch=FetchType.LAZY,optional=false)
	        		@JoinColumn(name="Eduid",nullable=false)
	        		private Education Eduid; 


	        		@ManyToOne(fetch=FetchType.LAZY,optional=false)
	        		@JoinColumn(name="cr",nullable=false)
	        		private Company cr ;

	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "e_position", nullable = false)
	                private String e_position;

	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "name_company", nullable = false)
	                private String name_company;

	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "s_date", nullable = false)
	                private Timestamp s_date;

	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "e_date")
	                private Timestamp e_date;

	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "add_by", nullable = false)
	                private String add_by;
	                
	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "ref_name")
	                private String ref_name;
	                
	        		  @NotNull(message = " cannot be Empty ")
	                @Column(name = "ref_email")
	                private String ref_email;
	                
	                
	                
	                
	            	public Experience() {
						super();
					}

					@Builder
					
					
					public Experience(long Exp_id, Individual NationalID, Education Eduid, Company cr,
							String e_position, String name_company, Timestamp s_date, Timestamp e_date, String add_by,
							String ref_name, String ref_email) {
						super();
						this.Exp_id = Exp_id;
						this.NationalID = NationalID;
						this.Eduid = Eduid;
						this.cr = cr;
						this.e_position = e_position;
						this.name_company = name_company;
						this.s_date = s_date;
						this.e_date = e_date;
						this.add_by = add_by;
						this.ref_name = ref_name;
						this.ref_email = ref_email;
					}

					public long getExp_id() {
						return Exp_id;
					}

					public void setExp_id(long exp_id) {
						Exp_id = exp_id;
					}

					public Individual getNationalID() {
						return NationalID;
					}

					public void setNationalID(Individual nationalID) {
						NationalID = nationalID;
					}

					public String getE_position() {
						return e_position;
					}

					public void setE_position(String e_position) {
						this.e_position = e_position;
					}

					public String getName_company() {
						return name_company;
					}

					public void setName_company(String name_company) {
						this.name_company = name_company;
					}

					public Timestamp getS_date() {
						return s_date;
					}

					public void setS_date(Timestamp s_date) {
						this.s_date = s_date;
					}

					public Timestamp getE_date() {
						return e_date;
					}

					public void setE_date(Timestamp e_date) {
						this.e_date = e_date;
					}

					public String getAdd_by() {
						return add_by;
					}

					public void setAdd_by(String add_by) {
						this.add_by = add_by;
					}

					public String getRef_name() {
						return ref_name;
					}

					public void setRef_name(String ref_name) {
						this.ref_name = ref_name;
					}

					public String getRef_email() {
						return ref_email;
					}

					public void setRef_email(String ref_email) {
						this.ref_email = ref_email;
					}
					

					public Education getEduid() {
						return Eduid;
					}

					public void setEduid(Education eduid) {
						Eduid = eduid;
					}



					@Override
					public String toString() {
						return "Experience [Exp_id=" + Exp_id + ", NationalID=" + NationalID + ", Eduid=" + Eduid
								+ ", cr=" + cr + ", e_position=" + e_position + ", name_company=" + name_company
								+ ", s_date=" + s_date + ", e_date=" + e_date + ", add_by=" + add_by + ", ref_name="
								+ ref_name + ", ref_email=" + ref_email + ", toString()=" + super.toString() + "]";
					}
	}
