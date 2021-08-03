package com.rza.HomeLibrary.business.concretes;

import com.rza.HomeLibrary.business.abstracts.AuthorService;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.core.utilities.results.SuccessDataResult;
import com.rza.HomeLibrary.core.utilities.results.SuccessResult;
import com.rza.HomeLibrary.dataAccess.abstracts.AuthorDao;
import com.rza.HomeLibrary.entities.concretes.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManager implements AuthorService {

    private AuthorDao authorDao;

    @Autowired
    public AuthorManager(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }


    @Override
    public Result add(Author author) {
        this.authorDao.save(author);
        return new SuccessResult("Kayıt işlemi başarılı.");
    }

    @Override
    public DataResult<List<Author>> getAll() {
        return new SuccessDataResult<List<Author>>(this.authorDao.findAll(),"Veriler getirildi.");
    }
}
