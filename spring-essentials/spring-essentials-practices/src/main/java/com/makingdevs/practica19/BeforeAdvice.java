package com.makingdevs.practica19;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {
  
  private Log log = LogFactory.getLog(BeforeAdvice.class);
  
  @Before("execution(* com.makingdevs.practica18.*Service*.*(..))")
  public void beforeMethod(JoinPoint joinPoint) {
    log.debug("Before advice method in " + joinPoint.getSignature().getName() + " with arguments:");
    for(Object o:joinPoint.getArgs()){
      log.debug("\t - " + o);
    }
  }
}
