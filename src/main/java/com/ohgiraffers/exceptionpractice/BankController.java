package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bank/*")
public class BankController {

    /* 예람: Service 메소드를 이용하기 위해서 해당 객체를 private final로 선언*/
    private final BankService bankService;

    /* 예람: 불변성 보장을 위해 생성자를 이용한 의존성 주입 */
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("deposit")
    public void deposit(){};

    @GetMapping("withdraw")
    public void withdraw(){};

    /* 예람 : 출금 요청 시, 클라이언트에서 입력 된 값을 @RequestParam으로 받는다.  */
    @PostMapping("withdraw")
    public ModelAndView withdraw(ModelAndView mv, @RequestParam int price){

        /* 서비스 객체에 해당 price를 넘겨주고 결과를 받음.*/
        boolean result = bankService.checkAccount(price);

        /* 결과에 따른 view 처리 */
        if(result){
            /* 입금이 가능하면 메인 페이지로 이동한다. */
            mv.setViewName("redirect:/");
        }
        else{
            /* 입금이 불가하면 사용자 exception을 내보낸다. */
            /* ModelAndView를 이용해서 exception을 view에 넘겨주고, view page name도 넘겨준다.*/
            OutUnderZeroException exception = new OutUnderZeroException("잔액이 부족합니다.");
            mv.addObject("exception", exception);
            mv.setViewName("error/outUnderZeroException");
        }

        return mv;

    }

}
