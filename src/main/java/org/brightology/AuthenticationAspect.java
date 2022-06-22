package org.brightology;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(org.brightology..*)")
    public void authenticatingPointCut(){

    }

    @Pointcut("within(org.brightology..*)")
    public void authorizationPointCut(){
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticated(){
        System.out.println("Authenticating the Request");
    }
}
