package com.osama.studentservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    private String name;
    private Date assignedDate;

    public Course() {
    }

    public Course(String name, Date assignedDate) {
        this.name = name;
        this.assignedDate = assignedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
