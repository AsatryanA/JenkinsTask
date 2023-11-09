package com.epam.jenkinstask.service;

import com.epam.jenkinstask.model.Student;
import com.epam.jenkinstask.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public List<Student> getStudents() {
       return studentRepository.findAll();
    }
}
