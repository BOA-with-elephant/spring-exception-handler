package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public boolean checkAccount(int price){

        return price <= 50000 ;
    }

}
