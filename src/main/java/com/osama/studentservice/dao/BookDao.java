package com.osama.studentservice.dao;

import com.osama.studentservice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {}
