package com.acciojob.librarymanagementsystems.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;

    private String name;

    private Integer age;

    private String emailId;

    private Double rating;

//    @Column(defaultValue = 4)
    @Column(columnDefinition = "INT DEFAULT 0")
    private int noOfBooks;

}
