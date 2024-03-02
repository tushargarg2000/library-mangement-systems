package com.acciojob.librarymanagementsystems.Controllers;

import com.acciojob.librarymanagementsystems.Entities.Book;
import com.acciojob.librarymanagementsystems.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("add")
    public ResponseEntity addBook(@RequestBody Book book) {

        try {
            String result = bookService.addBook(book);
            return new ResponseEntity(result, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/associateBookAndAuthor")
    public String associateBookAndAuthor(@RequestParam("bookId")Integer bookId,
                                         @RequestParam("authorId")Integer authorId){
    try{
        String result = bookService.associateBookAndAuthor(bookId,authorId);
        return result;
    } catch (Exception e){
        return e.getMessage();
        }

    }

    @GetMapping("/getBookByAuthor")
    public List<Book> getBookListByAuthor(@RequestParam("authorId")Integer authorId) {

        List<Book> ansList = bookService.findBooksByAuthor(authorId);
        return ansList;
    }
}
