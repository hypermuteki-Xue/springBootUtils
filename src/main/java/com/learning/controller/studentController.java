package com.learning.controller;

import com.learning.domain.student;
import com.learning.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    studentService studentService;
    @GetMapping("/{id}")
    Result FindStudent(@PathVariable Integer id)
    {
        return new Result(Code.FIND_OK,studentService.FindStudent(id));
    }

}
