package com.rza.HomeLibrary.business.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    Result add(Category category);
    DataResult<List<Category>> getAll();
}
