package com.example.ung_dung_muon_sach.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class UserAspect {
    private Logger logger = Logger.getLogger(UserAspect.class.getName());
    @Pointcut("execution (* com.example.ung_dung_muon_sach.service.impl.BorrowService.*(..))")
    public void loginService(){
    }
    @Around("loginService()")
    public Object writeLogBefore(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName=joinPoint.getSignature().getName();
        logger.info("========== Before call method: " +methodName);
        Object result=joinPoint.proceed();
        logger.info("========== After call method : " +methodName);
        return result;
    }




    @Pointcut("execution (* com.example.ung_dung_muon_sach.controller.user.UserController.*(..))")
    public void loginController(){
    }
    @Around("loginController()")
    public Object writeLogController(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName=joinPoint.getSignature().getName();
        logger.info("==========Have a people pay a visit to library : ");
        Object result=joinPoint.proceed();
        logger.info("==========User use method name : " +methodName);
        return result;
    }
}