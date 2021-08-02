package com.rza.HomeLibrary.business.concretes;

import com.rza.HomeLibrary.business.abstracts.BookService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.core.utilities.results.SuccessDataResult;
import com.rza.HomeLibrary.core.utilities.results.SuccessResult;
import com.rza.HomeLibrary.dataAccess.abstracts.BookDao;
import com.rza.HomeLibrary.entities.concretes.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {

    private BookDao bookDao;

    @Autowired
    public BookManager(BookDao bookDao) {

        this.bookDao = bookDao;
    }

    @Override
    public Result add(Book book) {
        this.bookDao.save(book);
        return new SuccessResult("Kayıt işlemi başarılı");
    }

    @Override
    public DataResult<List<Book>> getAll() {
        return new SuccessDataResult<List<Book>>(this.bookDao.findAll(),"Veriler getirildi");
    }
}
