package com.rza.HomeLibrary.api.controllers;

import com.rza.HomeLibrary.business.abstracts.CategoryService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    private CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService){
       this.categoryService =categoryService;
    }

    @GetMapping("getall")
    public DataResult<List<Category>>  getAll(){
        return this.categoryService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody Category category){
        return this.categoryService.add(category);
    }


}
