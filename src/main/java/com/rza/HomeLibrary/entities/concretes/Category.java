package com.rza.HomeLibrary.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","categories"})

public class Category {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryName;

    @ManyToMany(mappedBy = "categories",fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Book> books;



}
