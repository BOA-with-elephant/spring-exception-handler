package com.ohgiraffers.exceptionpractice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BankService {

    public void outOverException(int price) throws OutOverRequestException {
        if (price > 0) {
            throw new OutOverRequestException("잔고보다 출금요청액이 더 큽니다.");
        }
    }


}
