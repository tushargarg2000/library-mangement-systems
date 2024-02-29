package com.acciojob.librarymanagementsystems.Repositories;

import com.acciojob.librarymanagementsystems.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {

}
