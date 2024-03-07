package com.acciojob.librarymanagementsystems.Controllers;

import com.acciojob.librarymanagementsystems.Entities.Student;
import com.acciojob.librarymanagementsystems.Services.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

        String result = studentService.addStudent(student);
        return result;
    }

    @GetMapping("/getTopperStudents")
    public List<Student> getStudents(@RequestParam("branch")String branch,
                                     @RequestParam("cgpa")double cgpa){

        List<Student> ansList = studentService.findStudents(branch,cgpa);
        return ansList;
    }

}
