package com.rza.HomeLibrary.business.abstracts;


import com.rza.HomeLibrary.core.entities.User;
import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import org.springframework.stereotype.Service;


import java.util.List;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
    DataResult<List<User>> getAll();
}
