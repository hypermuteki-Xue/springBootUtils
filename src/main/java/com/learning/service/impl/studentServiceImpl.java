package com.learning.service.impl;

import com.learning.dao.studentDao;
import com.learning.domain.student;
import com.learning.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    studentDao studentDao;
    @Override
    public student FindStudent(int id) {
        return studentDao.findStudent(id);
    }
}
