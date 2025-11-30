package com.knowledge.springbootsample.controller;

import com.knowledge.springbootsample.exception.ResourceNotFoundException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping("/getAllData")
    private ResponseEntity<Object> getStudentData() {
        List<StudentDTO> studentDTOList = List.of(
                new StudentDTO(1, "Mukul", 123),
                new StudentDTO(2, "Sahil", 324)
        );
        return new ResponseEntity<>(studentDTOList, HttpStatus.OK);
    }

    @GetMapping("/throwError")
    private ResponseEntity<Object> getData(){
        throw new ResourceNotFoundException("Error");
        }

    }



record StudentDTO(Integer id,String name,Integer rollNo){

}





