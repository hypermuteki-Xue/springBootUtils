package com.learning.controller;

import com.learning.domain.book;
import com.learning.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class bookController {
    @Autowired
    bookService bookService;
    @RequestMapping("/book/find")
    @ResponseBody
    public Result findBook(int id) throws Exception {
        if(id==1)throw new Exception();
        return new Result(Code.FIND_OK,bookService.findBook(id));
    }
    @RequestMapping("/book/save")
    @ResponseBody
    public Result saveBook(@RequestBody book book)
    {
        return new Result(Code.SAVE_OK,bookService.saveBook(book.getId(),book.getBookName()));
    }
    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1, @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")Date date3){

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date3);
        return "quest received";
    }
}
