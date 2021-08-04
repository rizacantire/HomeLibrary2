package com.rza.HomeLibrary.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","books"})

public class Book {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookName;

    private int page;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "books_categories"
    ,joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    public List<Category> categories;

    private boolean isRead;

    private boolean isExist;
}
