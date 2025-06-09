package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Service;

@Service
public class BankService {


    public String depositInOverMoney(int depositMoney) throws InOverMoneyException{

        if(depositMoney > 1000000){
            throw new InOverMoneyException("입금 최고 한도는 100만원까지 입니다. 100만원 초과 금액은 입금 불가합니다.");
        }

        String message = depositMoney + "원 입금 완료했습니다.";

        return message;
    }
}
