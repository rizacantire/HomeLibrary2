package com.rza.HomeLibrary.business.concretes;

import com.rza.HomeLibrary.business.abstracts.CategoryService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.core.utilities.results.SuccessDataResult;
import com.rza.HomeLibrary.core.utilities.results.SuccessResult;
import com.rza.HomeLibrary.dataAccess.abstracts.CategoryDao;
import com.rza.HomeLibrary.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("İşlem başarılı");
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"Veriler getirildi");
    }
}
