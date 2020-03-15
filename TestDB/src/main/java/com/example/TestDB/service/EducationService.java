package com.example.TestDB.service;

import java.util.NoSuchElementException;

//import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.error.NotFoundException;
//import com.example.TestDB.error.NotFoundException;
import com.example.TestDB.mapperImp.EducationMapperImp;
import com.example.TestDB.model.Education;
import com.example.TestDB.repository.EducationRepository;


import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor
public class EducationService {
	@Autowired
	private EducationRepository educationRepository;
    private  static final EducationMapperImp EducationMapperImp = new EducationMapperImp();
    public  EducationDTO  createEducationDTO (EducationDTO  EducationDTO ) {
      
    	 Education   education =  Education .builder()
                    
                    .Email( EducationDTO.getEmail())
                    .PhoneNumber( EducationDTO.getPhoneNumber())
                    .Address( EducationDTO.getAddress())
                    .Password( EducationDTO.getPassword())
                    .Edu_iD(EducationDTO.getEdu_iD())
                    .EDU_NAME( EducationDTO.getEDU_NAME())
                 
              
      

                    .build();
    	 Education  saveEducation  = educationRepository.save(education);
            return EducationMapperImp.domainToDto(saveEducation);
            
        }
    public EducationDTO updateEDU_NAMEEducationDTO (String Edu_iD, String EDU_NAME) {
    	try {
    		educationRepository.updateEDU_NAME(Edu_iD, EDU_NAME);
    		 return educationRepository.findById(Edu_iD)
    				  .map(EducationMapperImp::domainToDto).get();
    	}catch (NoSuchElementException ex) {
        throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", Edu_iD));
    }
    	
    	
}
}


