package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.EducationDTO;
import com.example.TestDB.mapperImp.EducationMapperImp;
import com.example.TestDB.model.Education;
import com.example.TestDB.repository.EducationRepository;


import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor
public class EducationService {
	@Autowired
	private EducationRepository educationRepository;
    private  static final EducationMapperImp EducationMapper = new EducationMapperImp();
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
            return EducationMapper.domainToDto(saveEducation);
            
        }
}


