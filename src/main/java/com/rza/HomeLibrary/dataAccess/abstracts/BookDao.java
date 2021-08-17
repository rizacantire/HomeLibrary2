package com.rza.HomeLibrary.dataAccess.abstracts;

import com.rza.HomeLibrary.core.utilities.results.DataResult;
import com.rza.HomeLibrary.core.utilities.results.Result;
import com.rza.HomeLibrary.entities.concretes.Book;
import com.rza.HomeLibrary.entities.dtos.BookDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    List<Book> findBookByBookName(String bookName);
    Book findByBookName(String bookName);

    Book findBookById(int id);

    List<Book> findBookByCategories_CategoryId(int categoryId);

    @Query("Select new com.rza.HomeLibrary.entities.dtos.BookDetailDto(b.id,b.bookName,b.author.firstName,b.author.lastName,b.page,c.categoryName) From Category c " +
            "Inner Join c.books b ")
    List<BookDetailDto> getBookDetail();

}
