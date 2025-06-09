package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/bank/*")
public class BankController {

    BankService bankService;

    public BankController(BankService bankService){
        this.bankService = bankService;
    }

    @GetMapping("deposit")
    public void deposit(){};

    @GetMapping("withdraw")
    public void withdraw(){};

    @PostMapping("deposit")
    public ModelAndView depositInOverMoney(ModelAndView mv, WebRequest request, RedirectAttributes rttr) {

        int depositMoney = Integer.parseInt(request.getParameter("price"));

        try {
            rttr.addFlashAttribute("depositMessage", bankService.depositInOverMoney(depositMoney));
            mv.setViewName("redirect:/");
        } catch (InOverMoneyException e) {
            throw new RuntimeException(e);
        }

        return mv;

    }

}
