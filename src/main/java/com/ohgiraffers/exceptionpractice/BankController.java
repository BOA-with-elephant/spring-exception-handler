package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank/*")
public class BankController {

    @GetMapping("deposit")
    public void deposit(){};

    @GetMapping("withdraw")
    public void withdraw(){};

}
