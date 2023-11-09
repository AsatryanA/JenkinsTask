package com.epam.jenkinstask.controller;


import com.epam.jenkinstask.model.Student;
import com.epam.jenkinstask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping(value = "/student/all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
