package com.acciojob.librarymanagementsystems.Entities;

import com.acciojob.librarymanagementsystems.Enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(unique = true)
    private String title;

    private Integer noOfPages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer price;

    private Boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;

}
