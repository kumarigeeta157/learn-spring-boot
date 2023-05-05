package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class StudentController {
    @RequestMapping("/student")
    public List<Student> getStudent(){
        return Arrays.asList(
                new Student(1, "Aman" , 1),
                new Student(2, "Amar" , 2),
                new Student(10000, "rahul" ,3 )
        );
    }

}
