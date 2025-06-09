package com.ohgiraffers.exceptionpractice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InOverMoneyException.class)
    public String inOverMoneyException(Model model, InOverMoneyException exception){

        System.out.println("InOverMoney Exception 발생");
        model.addAttribute("exception", exception);
        return "error/inOverMoney";
    }
    
}
