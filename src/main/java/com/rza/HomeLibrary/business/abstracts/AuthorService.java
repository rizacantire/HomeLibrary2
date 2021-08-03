package com.rza.HomeLibrary.business.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Author;

import java.util.List;

public interface AuthorService {
    Result add(Author author);
    DataResult<List<Author>> getAll();
}
