package com.acciojob.librarymanagementsystems.Repositories;

import com.acciojob.librarymanagementsystems.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
