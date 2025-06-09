package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bank/*")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("deposit")
    public void deposit(){};

    @GetMapping("withdraw")
    public void withdraw(){};

    @PostMapping("/withdraw")
    public String handleWithdraw(@RequestParam int price) throws OutOverRequestException {
        bankService.outOverException(price);
        return "";
    }
}
