package com.example.TestDB.controller;

	import java.sql.Timestamp;

	import org.springframework.beans.factory.annotation.Autowired;

    import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
    import com.example.TestDB.dto.IndividualDTO;
    //   import com.example.TestDB.model.Individual;
	//import com.example.TestDB.repository.IndividualRepository;
    import com.example.TestDB.service.IndividualService;

   // @SpringBootApplication
  //  @EnableAutoConfiguration
	@RestController

	public class IndividualController {

    	@Autowired
    	IndividualService individualService;
    	IndividualDTO individualDTO = new IndividualDTO("ghadahDkhail@gmail.com","0502225926","alnarjes","50505","1095027437","Ghadah","Dkhail","aljbreen",true,"single","Reading",
                Timestamp.valueOf("2021-02-20 00:00:00.123789"),"CS","URLL","Programming");

  @RequestMapping("/crs")
  public String create() {

         individualService.createIndividualDTO(individualDTO);
         return "Create Done"; 
  }

}

    
    
//    @Autowired 
//    IndividualRepository IndividualRepository;
//
//    @RequestMapping("/insertIndividual")
//    public String process() {
//           //Indrepository.deleteAll();
// 	   IndividualRepository.save(new Individual ("aljbreengha","05225926","arjes","55","1095037","hada","Dhail","aljreen",true,"sigle","rad", Timestamp.valueOf("1985-06-18 00:00:00.12989"),"S","RL","pogrammer"));
//
//           return "Individual Done";
//
//    }
//    @RequestMapping("/updateIndividual")
//    public String update() {
//    IndividualRepository.updateStatus("1095927437","mmmired");
//    return "Done";
//    }
//}
//
//