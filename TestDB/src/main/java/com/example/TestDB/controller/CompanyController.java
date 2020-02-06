package com.example.TestDB.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestDB.model.Company;
import com.example.TestDB.repository.CompanyRepository;


@RestController

public class CompanyController {

       @Autowired 
       CompanyRepository Gndrepository;

       @RequestMapping("saveCompany")
       public String process() {
             
              Gndrepository.save(new Company ("aljbreenmasheal","05556765","alrawadh","551223421","551253421","IBM",Timestamp.valueOf("1988-09-16 00:00:00.123699"),Timestamp.valueOf("1956-02-18 00:00:00.1256789")));
              return "Company Done";

       }
}

