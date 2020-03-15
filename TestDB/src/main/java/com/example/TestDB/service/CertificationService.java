package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	 CertificationRepository certificationRepository;
    private static final CertificationMapperImp  CertificationMapperImp = new CertificationMapperImp();
    public   ResponseEntity <Certification> createCertificationDTO( CertificationDTO  certificationDTO) {
      
    	Certification  certification= Certification.builder()
                    .cERT_id(certificationDTO.getCERT_id())
                    .dEGREE(certificationDTO.getDEGREE())
                    .nationalID(certificationDTO.getNationalID())
                    .eDU_NAME(certificationDTO.getEDU_NAME())
                    .aDDBY(certificationDTO.getADDBY())
                    .cERT_DATE(certificationDTO.getCERT_DATE())
                    .gPA(certificationDTO.getGPA())
                    .mAJOR(certificationDTO.getMAJOR())
                    .aTTACH(certificationDTO.getATTACH()).build();
    	Certification saveCertification = certificationRepository.save(certification);
             CertificationMapperImp.domainToDto(saveCertification);
         	 return new ResponseEntity<>(saveCertification, HttpStatus.CREATED);
}
    

}
