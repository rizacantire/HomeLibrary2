package com.rza.HomeLibrary.api.controllers;

import com.rza.HomeLibrary.business.abstracts.BookService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Book;
import com.rza.HomeLibrary.entities.dtos.BookDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books/")
@CrossOrigin
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

    @PostMapping("findBook")
    public Result findBook(@RequestBody String bookName){
        return this.bookService.findBookByBookName(bookName);
    }

    @PostMapping("findById")
    public Result findById(@RequestBody int id){
        return this.bookService.findBookById(id);
    }

    @GetMapping("findCategory")
    public Result findCategory(@RequestParam int id){
        return this.bookService.findBookByCategory_CategoryId(id);
    }

    @GetMapping("getDetail")
    public DataResult<List<BookDetailDto>> getDetail(){
        return this.bookService.getBookDetail();
    }

    @GetMapping("findName")
    public DataResult<Book> findName(@RequestParam String name){
        return this.bookService.findBookByName(name);
    }



}
