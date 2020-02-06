package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.IndividualDTO;
import com.example.TestDB.mapperImp.IndividualMapperImp;
import com.example.TestDB.model.Individual;
import com.example.TestDB.repository.IndividualRepository;

import lombok.AllArgsConstructor;


@Service

@AllArgsConstructor

public class IndividualService {
	
	@Autowired
    IndividualRepository individualRepository;
    private static final IndividualMapperImp individualMapper = new IndividualMapperImp();
    public IndividualDTO createIndividualDTO(IndividualDTO individualDTO)
    
    
    
    {
      
    	Individual individual = Individual.builder()
                    .Email(individualDTO.getEmail())
                    .Phonenumber(individualDTO.getPhoneNumber())
                    .Address(individualDTO.getAddress())
                    .Password(individualDTO.getPassword())
                    .NationalID(individualDTO.getNationalID())
                    .FirstName(individualDTO.getFirstname())
                    .MName(individualDTO.getMName())
                    .lastName(individualDTO.getLastname())
                    .Gender(individualDTO.getGender())
                    .Status(individualDTO.getStatus())
                    .Skills(individualDTO.getSkills())
                    .DOB(individualDTO.getDOB())
                    .Attachments(individualDTO.getAttachments())
                    .JOP(individualDTO.getJOP())
                    .MAJOR(individualDTO.getMAJOR())


                    .build();
    	Individual saveIndividual= individualRepository.save(individual);
            return individualMapper.domainToDto(saveIndividual);
            
        }

}