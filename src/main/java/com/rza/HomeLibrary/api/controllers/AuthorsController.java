package com.rza.HomeLibrary.api.controllers;

import com.rza.HomeLibrary.api.controllers.abstracts.ControllerInterface;
import com.rza.HomeLibrary.business.abstracts.AuthorService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/authors/")
public class AuthorsController implements ControllerInterface<Author> {

    private AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @Override
    @PostMapping("add")
    public Result add(@RequestBody Author entity) {
        return this.authorService.add(entity);
    }


    @Override
    @GetMapping("get")
    public DataResult<List<Author>> getAll() {
        return this.authorService.getAll();
    }
}
