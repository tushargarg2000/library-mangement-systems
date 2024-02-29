package com.acciojob.librarymanagementsystems.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //This is the schema of how Student Table will look like
@Table(name = "student_info")
@Getter
@Setter
@NoArgsConstructor //This is like a default constructor
@AllArgsConstructor //This is like a constructor having all the arguments
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    @Column(nullable = false)
    private String name;

    private String branch;

    @Column(nullable = false)
    private Double cgpa;

    @Column(unique = true)
    private String emailId;
}
