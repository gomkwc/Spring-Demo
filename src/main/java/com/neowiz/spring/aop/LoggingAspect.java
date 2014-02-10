package com.neowiz.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * GE Team - NMP AP
 *
 *  AspectJ 설정하기 (설정) > 관점(Aspect) 정의하기 > 포인트컷(Pointcut) 정의하기 > 충고(Advice) 정의하기
 *
 * @author David KIM
 * @since 1.0
 */
@Aspect
public class LoggingAspect {

    @Before("execution(* com.neowiz.spring.demo.service.UserService.getUserInfo(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    @After("execution(* com.neowiz.spring.demo.service.UserService.getUserInfo(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    //
    @AfterReturning(pointcut = "execution(* com.neowiz.spring.demo.service.UserService.getUserInfo(..))",  returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("logAfterReturning() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
        System.out.println("******");
    }
}
