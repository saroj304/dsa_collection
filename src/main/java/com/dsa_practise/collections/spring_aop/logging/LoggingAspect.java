package com.dsa_practise.collections.spring_aop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component

public class LoggingAspect {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.dsa_practise.collections.spring_aop.logging_service.*.*(..))")
    public void commonAdvice() {
    }

    @Before("commonAdvice()")
    public void printLog(JoinPoint joinPoint) {
        log.info("executing method " + joinPoint.getSignature().getName() + " in class " + joinPoint.getTarget().getClass().getName());
    }
}
