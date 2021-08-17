package com.rza.HomeLibrary.business.concretes;

import com.rza.HomeLibrary.business.abstracts.UserService;
import com.rza.HomeLibrary.core.dataAccess.UserDao;
import com.rza.HomeLibrary.core.entities.User;
import com.rza.HomeLibrary.core.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }



    @Override
    public Result add(User user) {
        var userExist = this.findByEmail(user.getMail());
       if(userExist.getData()==null){
           this.userDao.save(user);
           return new SuccessResult("Kullanıcı kaydı başarılı");
       }else {
           return new ErrorResult("Sistemde kayıtlı mail adresi.");
       }

    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByMail(email),"Kullanıcı bulundu");
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kullanıcı listesi geldi");
    }
}
