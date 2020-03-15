package com.example.TestDB.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.service.EducationService;


@RestController

	public class EducationController {

	@Autowired
	EducationService educationService;
	EducationDTO educationDTO = new EducationDTO("aljbreenghaah@gmail.com","055123421","alnajes","1245","99","pnnu");

@RequestMapping("/creEducation")
public String create() {

	educationService.createEducationDTO( educationDTO);
     return "Create Done"; 
}
@RequestMapping("/updateEDU_NAMEEducation")
public EducationDTO updateEDU_NAME() throws Exception {
	  return  educationService.updateEDU_NAMEEducationDTO("1","uyt");
}



	

}