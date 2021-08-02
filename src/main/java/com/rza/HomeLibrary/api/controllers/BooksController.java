package com.rza.HomeLibrary.api.controllers;

import com.rza.HomeLibrary.business.abstracts.BookService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books/")
public class BooksController {

    private BookService bookService;
    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("getall")
    public DataResult<List<Book>> getAll(){
        return this.bookService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody Book book){
        return this.bookService.add(book);
    }


}
