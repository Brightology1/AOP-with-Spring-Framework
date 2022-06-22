package org.brightology;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.brightology.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: " + arg);
    }
    @After("execution(* org.brightology.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("After Logger Method Called");
    }

    @Pointcut("execution(* org.brightology.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: " + retVal);
    }
}
