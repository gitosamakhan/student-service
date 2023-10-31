package com.osama.studentservice.controller;

import com.osama.studentservice.dao.CourseDao;
import com.osama.studentservice.domain.Course;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {

    @Autowired
    private CourseDao courseDao;

    @GetMapping
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@Valid @RequestBody Course course) {
        courseDao.save(course);
    }
}
