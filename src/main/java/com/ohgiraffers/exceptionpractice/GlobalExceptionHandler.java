package com.ohgiraffers.exceptionpractice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
    //Global exception handler가 이거
    @ExceptionHandler(OutOverRequestException.class)
    public String outOverRequestException(Model model, OutOverRequestException exception){
        System.out.println("전역 레벨 예외 처리");
        model.addAttribute("exception", exception);
        return "error/outOverException";
    }
}
