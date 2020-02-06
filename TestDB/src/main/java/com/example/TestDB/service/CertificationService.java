package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.CertificationDTO;
import com.example.TestDB.mapperImp.CertificationMapperImp;
import com.example.TestDB.model.Certification;
import com.example.TestDB.repository.CertificationRepository;


import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor

public class CertificationService {
	
	@Autowired
	private CertificationRepository certificationRepository;
    private static final CertificationMapperImp  CertificationMapper = new CertificationMapperImp();
    public  CertificationDTO createCertificationDTO( CertificationDTO  certificationDTO) {
      
    	Certification  certification= Certification.builder()
                    .CERT_id(certificationDTO.getCERT_id())
                    .DEGREE(certificationDTO.getDEGREE())
                    .NationalID(certificationDTO.getNationalID())
                    .UNI_NAME(certificationDTO.getUNI_NAME())
                    .ADDBY(certificationDTO.getADDBY())
                    .CERT_DATE(certificationDTO.getCERT_DATE())
                    .GPA(certificationDTO.getGPA())
                    .DEGREE(certificationDTO.getDEGREE())
                    .MAJOR(certificationDTO.getMAJOR())
                    .ATTACH(certificationDTO.getATTACH())
                    
                    
        

                    .build();
    	Certification saveCertification = certificationRepository.save(certification);
            return CertificationMapper.domainToDto(saveCertification);
}}
