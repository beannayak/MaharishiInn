/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.others;

import mum.maharishi.maharishiinn.domain.UserInformation;
import mum.maharishi.maharishiinn.domain.jptDomain;
import mum.maharishi.maharishiinn.service.UserInformationService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Binayak
 */
@Aspect
public class MyControllerAspect {
    @Before("execution(void mum.maharishi.maharishiinn.service.UserInformationService.*(..))")
    public void loggerMethod(JoinPoint joinPoint){
        System.out.println("function called: " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        if (args[0] instanceof String){
            System.out.println("argument is: " + args[0]);
        } else {
            UserInformation a = (UserInformation) args[0];
            System.out.println(a.getFirstName() + " " + a.getLastName());
        }
//        System.out.println("argument is: " + aName);
    }
    
    
    @AfterReturning (pointcut = "execution (* mum.maharishi.maharishiinn.service.UserInformationService.something(..))" , returning = "retVal")
    public void afterAspectMethod(JoinPoint jp, Object retVal){
        if (retVal instanceof jptDomain){
            ((jptDomain) retVal).setName("Arya Stark");
        } 
        
        System.out.println("function ran");
    }
    
    @Around ("execution (* mum.maharishi.maharishiinn.service.UserInformationService.nothing(..))")
    public Object aroundAspectMethod(ProceedingJoinPoint pjp) throws Throwable{
        //Before here
        Object retVal = null;
        try {
            Object[] args = pjp.getArgs();
            retVal = pjp.proceed(args);
            
            Object targetClass = pjp.getTarget();
            jptDomain val = ((UserInformationService)targetClass).something("here");
            
            System.out.println("val.value is: " + val.getName());
        } catch (Exception e){
            //After throw here
        } finally {
            //after finally here
        }
        
        //after here
        retVal = (Integer)retVal + 1;
        return retVal;
    }
}
