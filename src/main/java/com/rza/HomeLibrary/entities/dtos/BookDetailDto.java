package com.rza.HomeLibrary.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailDto {
    private String bookName;
    private String author;
    private int page;
    private boolean isRead;
    private boolean isExist;

}
