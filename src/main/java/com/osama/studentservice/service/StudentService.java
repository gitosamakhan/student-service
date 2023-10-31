package com.osama.studentservice.service;

import com.osama.studentservice.dao.BookDao;
import com.osama.studentservice.dao.CourseDao;
import com.osama.studentservice.dao.StudentDao;
import com.osama.studentservice.domain.Book;
import com.osama.studentservice.domain.Course;
import com.osama.studentservice.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private BookDao bookDao;

    public void enrollStudentToCourse(int studentId, int courseId) {
        Optional<Student> student = studentDao.findById(studentId);
        if (student.isPresent()) {
            Optional<Course> course = courseDao.findById(courseId);
            course.ifPresent(value -> student.get().enrollToCourse(value));
            studentDao.save(student.get());
        }
    }

    public void assignBook(int studentId, int bookId) {
        Optional<Student> student = studentDao.findById(studentId);
        if (student.isPresent()) {
            Optional<Book> book = bookDao.findById(bookId);
            book.ifPresent(value -> student.get().addBook(value));
            studentDao.save(student.get());
        }
    }

}
