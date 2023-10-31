package com.osama.studentservice.controller;

import com.osama.studentservice.dao.BookDao;
import com.osama.studentservice.domain.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping
    public List<Book> getBooks() {
        return bookDao.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@Valid @RequestBody Book book) {
        bookDao.save(book);
    }
}
