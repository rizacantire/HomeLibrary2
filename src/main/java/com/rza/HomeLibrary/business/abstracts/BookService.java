package com.rza.HomeLibrary.business.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Book;

import java.util.List;

public interface BookService {
    Result add(Book book);
    DataResult<List<Book>> getAll();
}
