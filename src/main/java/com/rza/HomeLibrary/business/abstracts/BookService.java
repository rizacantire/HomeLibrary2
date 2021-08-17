package com.rza.HomeLibrary.business.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Book;
import com.rza.HomeLibrary.entities.dtos.BookDetailDto;

import java.util.List;

public interface BookService {
    Result add(Book book);
    DataResult<List<Book>> getAll();
    DataResult<List<Book>> findBookByBookName(String bookName);
    DataResult<Book> findBookById(int id);
    DataResult<List<Book>> findBookByCategory_CategoryId(int categoryId);

    DataResult<Book> findBookByName(String bookName);

    DataResult<List<BookDetailDto>> getBookDetail();

}
