package com.dsa_practise.collections.spring_aop.authentication;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthenticationAspect {

    /*
        // @AfterThrowing to handle exceptions thrown by the service layer
    //    @AfterThrowing(pointcut = "execution(* com.dsa_practise.collections.spring_aop.authentication_service.*.*(..))", throwing = "exception")
        public void handleSecurityException(JoinPoint joinPoint, Exception exception) {
            // Log the exception or perform any action on exception
            System.out.println("Exception thrown in method: " + joinPoint.getSignature().getName());
            System.out.println("Exception message: " + exception.getMessage());

            if (exception instanceof SecurityException) {
                System.out.println("SecurityException caught in aspect");
            }
        }*/

    @Around("execution(* com.dsa_practise.collections.spring_aop.authentication_service.ServiceClass.verifyUser(..))")
    public Object logAroundAuthenticate(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Authenticate method");

        Object result = joinPoint.proceed(); // Proceed with the method execution

        System.out.println("After Authenticate method");

        return result; // Return the result if any
    }

}

