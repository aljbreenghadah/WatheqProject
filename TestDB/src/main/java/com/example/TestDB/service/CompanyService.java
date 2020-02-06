package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.CompanyDTO;
import com.example.TestDB.mapperImp.CompanyMapperImp;
import com.example.TestDB.model.Company;
import com.example.TestDB.repository.CompanyRepository;

import lombok.AllArgsConstructor;
@Service

@AllArgsConstructor

public class CompanyService {
	@Autowired
    private CompanyRepository companyRepository;
    private  static final CompanyMapperImp companyMapper = new CompanyMapperImp();
    public CompanyDTO createCompanyDTO(CompanyDTO CompanyDTO) {
      
    	 Company  company= Company.builder()
    			    .Email(CompanyDTO.getEmail())
                    .cr(CompanyDTO.getCr())
                    .Phonenumber(CompanyDTO.getPhoneNumber())
                    .Address(CompanyDTO.getAddress())
                    .Password(CompanyDTO.getPassword())
                    .StartDate(CompanyDTO.getStartDate())
                    .EndDate(CompanyDTO.getEndDate())
                    .companyName(CompanyDTO.getCompanyName())
      

                    .build();
    	Company saveCompany = companyRepository.save(company);
            return companyMapper.domainToDto(saveCompany);
            
        }
}

