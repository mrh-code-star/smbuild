package com.mrh.service;

import com.mrh.dao.BookMapper;
import com.mrh.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;



public class BookServiceImpl implements BookService {

//    service调用dao层：组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {

        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookByID(int id) {
        return bookMapper.queryBookByID(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
