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
    	IndividualDTO individualDTO = new IndividualDTO("ghad@gmail.com","0551084317","lqa","1092590","1098028237","Ghaa","Dkhkii","aljmeen",true,"snle","seang",
                Timestamp.valueOf("2018-06-16 00:37:19.1236789"),"CS","RLL","Prongg");

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