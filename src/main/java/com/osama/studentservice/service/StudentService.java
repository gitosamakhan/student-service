package com.osama.studentservice.service;

import com.osama.studentservice.dao.StudentDao;
import com.osama.studentservice.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentService {

    @Autowired
    private StudentDao studentDao;

}
