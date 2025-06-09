package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BankService {

    private final AccountDTO accountDTO;

    public BankService(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    public void outOverException(int price) throws OutOverRequestException {
        if (price > 0) {
            throw new OutOverRequestException("잔고보다 출금요청액이 더 큽니다.");
        }
    }


    public boolean checkAccount(int price){

        return 0 <= accountDTO.getPrice() ;
    }
    public String depositInOverMoney(int depositMoney) throws InOverMoneyException{

        if(depositMoney > 1000000){
            throw new InOverMoneyException("입금 최고 한도는 100만원까지 입니다. 100만원 초과 금액은 입금 불가합니다.");
        }

        String message = depositMoney + "원 입금 완료했습니다.";

        return message;
    }
}
