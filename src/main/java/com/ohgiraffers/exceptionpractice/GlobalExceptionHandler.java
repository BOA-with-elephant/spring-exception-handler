package com.ohgiraffers.exceptionpractice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OutUnderZeroException.class)
    public String outUnderZeroException(OutUnderZeroException exception){

        return "error/outUnderZeroException";
    }


}
