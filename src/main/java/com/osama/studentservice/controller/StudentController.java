package com.osama.studentservice.controller;

import com.osama.studentservice.dao.StudentDao;
import com.osama.studentservice.domain.Student;
import com.osama.studentservice.domain.StudentCard;
import com.osama.studentservice.exception.ResourceNotFoundException;
import com.osama.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentDao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find resource with id:" + id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@Validated @RequestBody Student student) {
        StudentCard studentCard = new StudentCard(UUID.randomUUID(), new Date(), new Date());
        student.setStudentCard(studentCard);
        studentDao.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        Optional<Student> student = studentDao.findById(id);
        student.ifPresent(value -> studentDao.delete(value));
    }

    @PostMapping("enroll-course/{studentId}/{courseId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void enrollStudentInCourse(@PathVariable int studentId,
                                      @PathVariable int courseId) {
        studentService.enrollStudentToCourse(studentId, courseId);
    }

    @PostMapping("/assign-book/{studentId}/{bookId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void assignBookToStudent(@PathVariable int studentId,
                                      @PathVariable int bookId) {
        studentService.assignBook(studentId, bookId);
    }
}
