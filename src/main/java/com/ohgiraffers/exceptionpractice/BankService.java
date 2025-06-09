package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final AccountDTO accountDTO;

    public BankService(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }


    public boolean checkAccount(int price){

        return 0 <= accountDTO.getPrice() ;
    }

}
