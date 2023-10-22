package com.osama.studentservice.dao;

import com.osama.studentservice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {}
