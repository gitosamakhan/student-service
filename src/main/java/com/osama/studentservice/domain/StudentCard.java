package com.osama.studentservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class StudentCard {

    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private UUID cardId;

    private Date assignedDate;

    private Date expiryDate;

    public StudentCard() {
    }

    public StudentCard(UUID cardId, Date assignedDate, Date expiryDate) {
        this.cardId = cardId;
        this.assignedDate = assignedDate;
        this.expiryDate = expiryDate;
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

    public UUID getCardId() {
        return cardId;
    }

    public void setCardId(UUID cardId) {
        this.cardId = cardId;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
