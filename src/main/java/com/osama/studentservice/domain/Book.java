package com.osama.studentservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String name;

    private Date assignedDate;

    public Book() {
    }

    public Book(String name, Date assignedDate) {
        this.name = name;
        this.assignedDate = assignedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }
}
