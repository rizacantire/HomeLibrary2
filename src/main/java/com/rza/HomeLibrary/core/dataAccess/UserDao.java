package com.rza.HomeLibrary.core.dataAccess;

import com.rza.HomeLibrary.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByMail(String mail);
    List<User> findAllByMail(String mail);

}