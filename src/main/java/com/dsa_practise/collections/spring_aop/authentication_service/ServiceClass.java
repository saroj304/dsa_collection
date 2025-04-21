package com.dsa_practise.collections.spring_aop.authentication_service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public void verifyUser(String role) {
        if (!role.contentEquals("user")) {
            System.out.println("role is not user");
            throw new SecurityException("role is aunthorized!!");
        }
        System.out.println("verifyUser");
    }
}
