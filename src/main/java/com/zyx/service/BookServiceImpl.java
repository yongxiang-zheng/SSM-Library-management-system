package com.zyx.service;

import com.zyx.dao.BookMapper;
import com.zyx.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service层调用dao层，使用组合的方式组合dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }
}
