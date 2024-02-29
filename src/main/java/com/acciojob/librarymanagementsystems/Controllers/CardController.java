package com.acciojob.librarymanagementsystems.Controllers;

import com.acciojob.librarymanagementsystems.Services.CardService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("card")
public class CardController {

    @Autowired
    private CardService cardService;


    @PostMapping("/generateCard")
    public ResponseEntity addCard(){

        String result = cardService.generateCard();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PutMapping("/associateCardAndStudent")
    public ResponseEntity associateCardAndStudent(@RequestParam("cardId")Integer cardId,
                                                  @RequestParam("studentId")Integer studentId){

        String result = cardService.associateCardAndStudent(cardId,studentId);
        return new ResponseEntity(result,HttpStatus.OK);
    }
}
