package com.learning.service;

import com.learning.domain.book;

public interface bookService {
    book findBook(int id);
    boolean saveBook(int id,String bookName);
}
