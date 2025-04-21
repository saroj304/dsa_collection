package com.dsa_practise.collections.spring_aop.logging_service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void printData() {
        System.out.println("iam inside testService");
    }
}