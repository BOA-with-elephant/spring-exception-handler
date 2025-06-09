package com.ohgiraffers.exceptionpractice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(inMinusMoney.class)
    public String inMinusMoney(Model model,inMinusMoney exception) {
        model.addAttribute("exception", exception);
        return "error/inMinusMoney";
    }

}
