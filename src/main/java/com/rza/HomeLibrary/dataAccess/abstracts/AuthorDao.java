package com.rza.HomeLibrary.dataAccess.abstracts;

import com.rza.HomeLibrary.entities.concretes.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author,Integer> {
}
