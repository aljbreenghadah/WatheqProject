package com.example.TestDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestDB.dto.CourseDTO;
import com.example.TestDB.mapperImp.CourseMapperImp;
import com.example.TestDB.model.Course;
import com.example.TestDB.repository.CourseRepository;
import lombok.AllArgsConstructor;


@Service

@AllArgsConstructor

public class courseService {
	@Autowired
    private CourseRepository courseRepository;
    private static final CourseMapperImp courseMapper = new CourseMapperImp();
    public CourseDTO createcourseDTO(CourseDTO courseDTO) {
      
    	Course course = Course.builder()
    			  .courseID(courseDTO.getCourseID())
                    .NationalID(courseDTO.getNationalID())
                    .Eduid(courseDTO.getEduid())
                    .cr(courseDTO.getCr())
                    .nameCourse(courseDTO.getNameCourse())
                    .addedBy(courseDTO.getAddedBy())
                    .nameInstittion(courseDTO.getNameInstittion())
                    .courseAttch(courseDTO.getCourseAttch())
                    .EndDate(courseDTO.getEndDate())
                  
                    	
          
                    
                    
                    
                 

                    .build();
    	Course saveCourse = courseRepository.save(course);
            return courseMapper.domainToDto(saveCourse);
}}