package com.acciojob.librarymanagementsystems.Repositories;

import com.acciojob.librarymanagementsystems.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
