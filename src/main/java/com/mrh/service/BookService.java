package com.mrh.service;

import com.mrh.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //    增加一本书
    int addBook(Books books);
    //    删除一本书
    int deleteBook(@Param("id") int id);
    //    更新一本书
    int updateBook(Books books);
    //    根据ID查询一本书
    Books queryBookByID(int id);
    //    查询全部书
    List<Books> queryAllBook();
}
