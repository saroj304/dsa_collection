package com.dsa_practise.collections.spring_aop.authentication;

import com.dsa_practise.collections.spring_aop.authentication_service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController implements CommandLineRunner {
    @Autowired
    ServiceClass userService;


    @Override
    public void run(String... args) throws Exception {
        userService.verifyUser("user");
    }
}