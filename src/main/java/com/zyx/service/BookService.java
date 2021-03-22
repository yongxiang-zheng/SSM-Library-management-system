package com.zyx.service;

import com.zyx.pojo.Books;

import java.util.List;

public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books selectBookById(int id);

    List<Books> selectAllBook();

}
