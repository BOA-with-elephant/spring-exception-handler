package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bank/*")
public class BankController {

    @GetMapping("deposit")
    public void deposit(){};

    @PostMapping("deposit")
    public String checkDeposit(Model model, @RequestParam int price) {
        if (price < 0) {
            new GlobalExceptionHandler();
        }
        return "/";
    }

    @GetMapping("withdraw")
    public void withdraw(){};

}
