package com.rza.HomeLibrary.dataAccess.abstracts;

import com.rza.HomeLibrary.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {
}
