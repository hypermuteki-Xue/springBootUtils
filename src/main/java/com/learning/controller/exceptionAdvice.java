package com.learning.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result dealException(Exception e)
    {
         return new Result(Code.FIND_ERROR,null,"错误出现");
    }
}
