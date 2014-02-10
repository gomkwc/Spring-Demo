package com.neowiz.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * GE Team - NMP AP
 *
 * @author David KIM
 * @since 1.0
 */
@Aspect
public class LoggingAspect {

    @Before("execution(* com.neowiz.demo.service.UserService.getUserInfo(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @After("execution(* com.neowiz.demo.service.UserService.getUserInfo(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
     }
}
