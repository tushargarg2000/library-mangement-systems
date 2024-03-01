package com.acciojob.librarymanagementsystems.Services;

import com.acciojob.librarymanagementsystems.Enums.CardStatus;
import com.acciojob.librarymanagementsystems.Entities.LibraryCard;
import com.acciojob.librarymanagementsystems.Entities.Student;
import com.acciojob.librarymanagementsystems.Repositories.CardRepository;
import com.acciojob.librarymanagementsystems.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//import java.util.Date;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public String generateCard(){

        //I want to save some Cards to the DB
        LibraryCard card = new LibraryCard(); //This object will go the DB and save it
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);

        Date expiryDate = new Date(1028,6,1);
        card.setValidity(expiryDate);
        card = cardRepository.save(card);
        return "The card has been generated with cardId "+card.getCardNo();

    }

    public String associateCardAndStudent(Integer cardId,Integer studentId){

        LibraryCard libraryCard = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();
        libraryCard.setCardStatus(CardStatus.ISSUED);
        libraryCard.setStudent(student); //Indirectly setting the FK in LC table
        //but bcz we are playing with entities so we will have to set as per the entity
        cardRepository.save(libraryCard);
        return "The card and student has been associated";
    }


}
