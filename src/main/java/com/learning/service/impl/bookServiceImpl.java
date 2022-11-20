package com.learning.service.impl;

import com.learning.dao.bookDao;
import com.learning.domain.book;
import com.learning.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookServiceImpl implements bookService {
    @Autowired
    com.learning.dao.bookDao bookDao;
    @Override
    public book findBook(int id) {
        return bookDao.findBook(id);
    }

    @Override
    public boolean saveBook(int id, String bookName) {
        return bookDao.saveBook(id,bookName);
    }
}
