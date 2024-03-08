package com.acciojob.librarymanagementsystems.Repositories;

import com.acciojob.librarymanagementsystems.Entities.Book;
import com.acciojob.librarymanagementsystems.Entities.LibraryCard;
import com.acciojob.librarymanagementsystems.Entities.Transaction;
import com.acciojob.librarymanagementsystems.Enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {

    Transaction findTransactionByBookAndCardAndTransactionStatus(Book book, LibraryCard card, TransactionStatus transactionStatus);

}
