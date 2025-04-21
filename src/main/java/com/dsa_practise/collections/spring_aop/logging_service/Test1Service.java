package com.dsa_practise.collections.spring_aop.logging_service;

import org.springframework.stereotype.Service;

@Service
public class Test1Service {

    public void add2Digit(int a, int b) {
        System.out.println(a + b);
    }
}
