package com.example.TestDB.model;

import java.io.Serializable;
//import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//  import javax.validation.constraints.Max;
//  import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Entity
@Table(name = "Education")
public class Education extends W_User implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@Column(name = "Edu_iD",unique=true, nullable = false)
	@NotNull(message = "Education id cannot be Empty ")
	private String Edu_iD;

	@Column(name = "EDU_NAME", nullable = false)
	@NotNull(message = "Education name  cannot be Empty ")
	private String EDU_NAME;





	@Builder

	public Education(String Email, String PhoneNumber, String Address, String Password, String Edu_iD,
			String EDU_NAME) {
		super(Email, PhoneNumber, Address, Password);
		this.Edu_iD = Edu_iD;
		this.EDU_NAME = EDU_NAME;
	}



	@Override
	public String toString() {
		return "Education [Edu_iD=" + Edu_iD + ", EDU_NAME=" + EDU_NAME + ", toString()=" + super.toString() + "]";
	}
	public String getEdu_iD() {
		return Edu_iD;
	}
	public void setEdu_iD(String edu_iD) {
		Edu_iD = edu_iD;
	}
	public String getEDU_NAME() {
		return EDU_NAME;
	}
	public void setEDU_NAME(String eDU_NAME) {
		EDU_NAME = eDU_NAME;
	}

}

